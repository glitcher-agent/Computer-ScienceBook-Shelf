package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);
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

    public boolean onCreateOptionsMenu(Menu menu) { return true; }
    public void pdf5(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_phVhMo9J6IBSlq-RPXHQCGsOLPSun4U/view"));
        startActivity(i);
    }
    public void pdf6(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://iiti.ac.in/people/~tanimad/JavaTheCompleteReference.pdf"));
        startActivity(i);
    }
    public void pdf7(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sureshvcetit.files.wordpress.com/2017/10/prentice-hall-internet-and-world-wide-web-how-to-program-5th-edition-0132151006.pdf"));
        startActivity(i);
    }
}
