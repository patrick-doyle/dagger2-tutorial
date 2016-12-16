package com.twistedeqations.dagger2tutorial.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.twistedeqations.dagger2tutorial.GithubApplication;
import com.twistedeqations.dagger2tutorial.R;
import com.twistedeqations.dagger2tutorial.models.GithubRepo;
import com.twistedeqations.dagger2tutorial.network.GithubService;
import com.twistedeqations.dagger2tutorial.screens.home.AdapterRepos;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

  @BindView(R.id.repo_home_list)
  ListView listView;

  Call<List<GithubRepo>> reposCall;

  @Inject
  GithubService githubService;

  @Inject
  AdapterRepos adapterRepos;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    ButterKnife.bind(this);

    HomeActivityComponent component = DaggerHomeActivityComponent.builder()
            .homeActivityModule(new HomeActivityModule(this))
            .githubApplicationComponent(GithubApplication.get(this).component())
            .build();

    component.injectHomeActivity(this);

    listView.setAdapter(adapterRepos);

    reposCall = githubService.getAllRepos();
    reposCall.enqueue(new Callback<List<GithubRepo>>() {
        @Override
        public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
          adapterRepos.swapData(response.body());
        }

        @Override
        public void onFailure(Call<List<GithubRepo>> call, Throwable t) {
          Toast.makeText(HomeActivity.this, "Error getting repos " + t.getMessage(), Toast.LENGTH_SHORT).show();
        }
      });
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    if(reposCall != null) {
      reposCall.cancel();
    }
  }
}
