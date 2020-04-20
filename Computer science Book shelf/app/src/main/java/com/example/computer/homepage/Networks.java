package com.example.aditya.homepage;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Networks extends AppCompatActivity {

    private CardView card1,card2,card3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networks);
        card1=findViewById(R.id.cards1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(Networks.this,cn.class);
            startActivity(i);
            }
        });

        card2=findViewById(R.id.cards2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Networks.this,computersecurity.class);
                startActivity(i);
            }
        });
        card3=findViewById(R.id.cards3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Networks.this,ip.class);
                startActivity(i);
            }
        });

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
}
