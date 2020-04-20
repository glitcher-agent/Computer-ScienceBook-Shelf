package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Python extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
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
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jgyan.com/courses/uploads/Fundamentals%20of%20Python_%20First%20Programs%20%5bLambert%202011-03-22%5d.pdf"));
        startActivity(a);
    }
    public void onc(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://greenteapress.com/thinkpython2/thinkpython2.pdf"));
        startActivity(a);
    }
    public void hard(View view){
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://marvin.cs.uidaho.edu/Teaching/CS515/pythonTutorial.pdf"));
        startActivity(a);
    }
    }
