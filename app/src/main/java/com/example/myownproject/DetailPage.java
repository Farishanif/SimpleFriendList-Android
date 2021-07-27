package com.example.myownproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailPage extends AppCompatActivity {
    public static final String mname = "new name";
    public static final String mdetail = "new detail";
    public static final int mphoto = R.drawable.apyr;
    private String title = "Friend Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);
        setActionBarTitle(title);

        String nname = getIntent().getStringExtra(mname);
        String ndetail = getIntent().getStringExtra(mdetail);
        int nphoto =  getIntent().getIntExtra(String.valueOf(mphoto), 0);

        TextView sNam = findViewById(R.id.Name);
        TextView sail = findViewById(R.id.Detail);
        ImageView sPhoto = findViewById(R.id.Photo);

        sNam.setText(nname);
        sail.setText(ndetail);
        sPhoto.setImageResource(nphoto);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}