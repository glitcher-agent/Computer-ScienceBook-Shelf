package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Compiler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);
        ActionBar actionBar = getSupportActionBar();
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
    public void pdf(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.informatik.uni-bremen.de/agbkb/lehre/ccfl/Material/ALSUdragonbook.pdf"));
        startActivity(a);
    }
    public void onc(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://hjemmesider.diku.dk/~torbenm/Basics/basics_lulu2.pdf"));
        startActivity(a);
    }
    public void hard(View view){
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vssut.ac.in/lecture_notes/lecture1422914957.pdf"));
        startActivity(a);
    }
    }
