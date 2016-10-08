package com.twistedeqations.dagger2tutorial;

import android.app.Activity;
import android.app.Application;

import com.fatboyindustrial.gsonjodatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.twistedeqations.dagger2tutorial.network.DateTimeConverter;
import com.twistedeqations.dagger2tutorial.network.GithubService;

import org.joda.time.DateTime;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.fatboyindustrial.gsonjodatime.Converters.DATE_TIME_TYPE;

public class GithubApplication extends Application {

  public static GithubApplication get(Activity activity) {
    return (GithubApplication) activity.getApplication();
  }

  private GithubService githubService;

  @Override
  public void onCreate() {
    super.onCreate();

    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
    Gson gson = gsonBuilder.create();

    Retrofit gitHubRetrofit = new Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create(gson))
      .baseUrl("https://api.github.com/")
      .build();

    githubService = gitHubRetrofit.create(GithubService.class);
  }

  public GithubService getGithubService() {
    return githubService;
  }
}