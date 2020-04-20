package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class th6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th6);
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

    public void pdf17(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uoitc.edu.iq/images/documents/informatics-institute/exam_materials/artificial%20intelligence%20structures%20and%20strategies%20for%20%20complex%20problem%20solving.pdf"));
        startActivity(intent);
    }

    public void pdf18(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://epub.uni-regensburg.de/13629/1/ubr06078_ocr.pdf"));
        startActivity(intent);
    }

}


