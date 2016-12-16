package com.twistedeqations.dagger2tutorial;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @GithubApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }
}
