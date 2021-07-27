package com.example.myownproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {

    private String title = "Profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        setActionBarTitle(title);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
