package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Rprog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rprog);
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
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://englianhu.files.wordpress.com/2016/05/advanced-r.pdf"));
        startActivity(a);
    }
    public void onc(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.studocu.com/en/document/drexel-university/statistics-and-design-of-experiments/book-solutions/miller-freunds-probability-and-statistics-for-engineers-9-pdf/2207640/view"));
        startActivity(a);
    }
    public void hard(View view){
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://cran.r-project.org/doc/manuals/r-release/R-intro.pdf"));
        startActivity(a);
    }

    }

