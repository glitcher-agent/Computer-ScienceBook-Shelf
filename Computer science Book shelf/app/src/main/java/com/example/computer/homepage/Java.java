package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
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
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://iiti.ac.in/people/~tanimad/JavaTheCompleteReference.pdf"));
        startActivity(a);
    }
    public void onc(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www2.nsru.ac.th/tung/java_doc/Core%20Java%20Volume%20I-%20Fundamentals%209th%20Edition-%20Horstmann,%20Cay%20S.%20&%20Cornell,%20Gary_2013.pdf"));
        startActivity(a);
    }
    public void hard(View view){
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ptgmedia.pearsoncmg.com/images/9780137081608/samplepages/013708160X.pdf"));
        startActivity(a);
    }
    }

