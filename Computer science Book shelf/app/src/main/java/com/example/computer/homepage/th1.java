package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class th1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_th1);
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
    public void pdf(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ff.tu-sofia.bg/~bogi/knigi/SE/Software%20Engineering%20Best%20Practices.%20Lessons%20from%20Successful%20Projects%20in%20the%20Top%20Companies%20(McGraw-Hill,%202010).pdf"));
        startActivity(intent);
    }
    public void pd1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dinus.ac.id/repository/docs/ajar/RPL-7th_ed_software_engineering_a_practitioners_approach_by_roger_s._pressman_.pdf"));
        startActivity(intent);
    }

}
