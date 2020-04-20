package com.example.aditya.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    private CardView c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this,Networks.class);
                startActivity(intent1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Main2Activity.this,Prog.class);
                startActivity(intent2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Main2Activity.this,Theory.class);
                startActivity(intent3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Main2Activity.this,Others.class);
                startActivity(intent4);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent a=new Intent(Main2Activity.this,aboutus.class);
        startActivity(a);
        return true;
    }
}
