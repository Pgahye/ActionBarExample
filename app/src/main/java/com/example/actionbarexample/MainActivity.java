package com.example.actionbarexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ActionBar actionBar = getSupportActionBar();
        //actionBar.setHomeButtonEnabled(true); 옛날버전...쓰지않음
      //  actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
        //actionBar.setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        System.out.println("===============> "+itemId+ " clicked");

        if(itemId == android.R.id.home){

            System.out.println("===============> home button clicked");

        }

        return super.onOptionsItemSelected(item);
    }
}
