package com.example.myownproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFriends;
    private ArrayList<Friend> list = new ArrayList<>();
    private String title = "Friend List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String title = "Friend List";
        setActionBarTitle(title);

        rvFriends = findViewById(R.id.rv_friends);
        rvFriends.setHasFixedSize(true);

        list.addAll(FriendsData.getListData());
        showList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.About:
                Intent moveIntent1 = new Intent( MainActivity.this, AboutPage.class);
                startActivity(moveIntent1);

                break;

            case R.id.Profile:
                Intent moveIntent2 = new Intent( MainActivity.this, ProfilePage.class);
                startActivity(moveIntent2);
                break;
        }
        setActionBarTitle(title);
    }


    private void showList() {
        rvFriends.setLayoutManager(new LinearLayoutManager(this));
        ListFriendsAdapter listFriendsAdapter = new ListFriendsAdapter(list);
        rvFriends.setAdapter(listFriendsAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}