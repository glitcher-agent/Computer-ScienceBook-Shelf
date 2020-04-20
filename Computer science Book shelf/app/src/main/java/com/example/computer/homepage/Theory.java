package com.example.aditya.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Theory extends AppCompatActivity {
    private CardView cv1,cv2,cv3,cv4,cv5,cv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        cv1=findViewById(R.id.t1);
        cv2=findViewById(R.id.t2);
        cv3=findViewById(R.id.t3);
        cv4=findViewById(R.id.t4);
        cv5=findViewById(R.id.t5);
        cv6=findViewById(R.id.t6);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th1.class);
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th2.class);
                startActivity(intent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th3.class);
                startActivity(intent);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th4.class);
                startActivity(intent);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th5.class);
                startActivity(intent);
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,th6.class);
                startActivity(intent);
            }
        });


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
}
