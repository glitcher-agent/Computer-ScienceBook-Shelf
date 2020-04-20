package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DataStruct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_struct);
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
            public void pdf(View view)
            {
                Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kiransrinivas.files.wordpress.com/2012/05/24148273-data-structure-book-part11.pdf"));
                startActivity(a);
            }
            public void onc(View view)
            {
                Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://index-of.es/Miscellanous/Data%20Structures%20Using%20C,%202nd%20edition.pdf"));
                startActivity(a);
            }
            public void hard(View view){
                Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://enos.itcollege.ee/~jpoial/algorithms/GT/Data%20Structures%20and%20Algorithms%20in%20Java%20Fourth%20Edition.pdf"));
                startActivity(a);
            }
        }
