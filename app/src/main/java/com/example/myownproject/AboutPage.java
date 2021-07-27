package com.example.myownproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutPage extends AppCompatActivity {

    private String title = "About";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        setActionBarTitle(title);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
