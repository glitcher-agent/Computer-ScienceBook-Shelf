package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class th5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th5);
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
    public void pdf15(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vinss.files.wordpress.com/2010/09/john-wiley-and-sons-object-oriented-analysis-and-design-understanding-system-development-with-uml-2-0-may-2005.pdf"));
        startActivity(intent);
    }
    public void pdf16(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://balu051989.files.wordpress.com/2011/06/the-unified-modeling-language-user-guide-by-grady-booch-james-rumbaugh-ivar-jacobson.pdf"));
        startActivity(intent);
    }
}
