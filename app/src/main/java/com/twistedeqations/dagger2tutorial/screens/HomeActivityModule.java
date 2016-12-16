package com.twistedeqations.dagger2tutorial.screens;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {

    private final HomeActivity homeActivity;

    public HomeActivityModule(HomeActivity homeActivity) {
        this.homeActivity = homeActivity;
    }

    @Provides
    @HomeActivityScope
    public HomeActivity homeActivity() {
        return homeActivity;
    }
}
