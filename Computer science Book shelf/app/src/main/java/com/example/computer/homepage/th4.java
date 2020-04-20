package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class th4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th4);
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
    public void pdf13(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VB0jR7La1yJpD6hoaqF2pmIjDRYVQ9rh/view?usp=sharing"));
        startActivity(intent);
    }
    public void pdf14(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mcdtu.files.wordpress.com/2017/03/introduction-to-automata-theory.pdf"));
        startActivity(intent);
    }


}
