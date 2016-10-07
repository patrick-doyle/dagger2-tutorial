package com.twistedeqations.dagger2tutorial.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.twistedeqations.dagger2tutorial.R;

public class HomeActivity extends AppCompatActivity {

  // https://api.github.com/users/TwistedEquations/repos

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }
}
