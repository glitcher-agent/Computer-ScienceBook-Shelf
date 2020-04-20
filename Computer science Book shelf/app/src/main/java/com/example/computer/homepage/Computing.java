package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Computing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computing);
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
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sgar91.files.wordpress.com/2011/10/mobile_communications_schiller_2e.pdf"));
        startActivity(a);
    }
    public void onc(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mediapiac.com/uploads/conference/presenters/documents/17/8.pdf"));
        startActivity(a);
    }
    public void hard(View view){
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://doc.lagout.org/programmation/Android/Android%20Programming_%20The%20Big%20Nerd%20Ranch%20Guide%20%5BPhillips%20%26%20Hardy%202013-04-07%5D.pdf"));
        startActivity(a);
    }

    }


