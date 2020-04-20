package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class th3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th3);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;


    }
    public void pdf11(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://inspirit.net.in/books/academic/Computer%20Organisation%20and%20Architecture%208e%20by%20William%20Stallings.pdf"));
        startActivity(intent);
    }

    public void pdf12(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B6xQefSTHeNvWWpmaGd4Y2FZRW8/view"));
        startActivity(intent);
    }


}
