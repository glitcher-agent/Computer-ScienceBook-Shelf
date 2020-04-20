package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class th2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th2);
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
        public void pdf9(View view)
        {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hfD7g4Z4FKfu4Lww58YwezJ6p2QcaxBY/view?usp=sharing\n"));
        startActivity(intent);
        }
    public void pdf10(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://materias.fi.uba.ar/7508/MOS4/Operating.Systems.4th.Edi.pdf"));
        startActivity(intent);
    }
    }

