package com.twistedeqations.dagger2tutorial.screens;

import com.twistedeqations.dagger2tutorial.GithubApplicationComponent;

import dagger.Component;

@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = GithubApplicationComponent.class)
public interface HomeActivityComponent {

    void injectHomeActivity(HomeActivity homeActivity);
}
