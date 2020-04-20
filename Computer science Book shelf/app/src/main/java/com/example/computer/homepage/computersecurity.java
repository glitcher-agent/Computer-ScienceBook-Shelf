package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class computersecurity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computersecurity);
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
    public void pdf3(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nwWI3i9ulaCB2gCVzPFVvGMGiRZ5dpq0/view?usp=sharing"));
        startActivity(i);
    }
    public void pdf4(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wanguolin.github.io/assets/cryptography_and_network_security.pdf"));
        startActivity(i);
    }
}
