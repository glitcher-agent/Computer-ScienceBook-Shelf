package com.example.aditya.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Prog extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5,c6,c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
       c1=findViewById(R.id.sub1);
        c2=findViewById(R.id.sub2);
        c3=findViewById(R.id.sub3);
        c4=findViewById(R.id.sub4);
        c5=findViewById(R.id.sub5);
        c6=findViewById(R.id.sub6);
        c7=findViewById(R.id.sub7);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,Cprog.class);
                startActivity(a);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            Intent a=new Intent(Prog.this,Java.class);
            startActivity(a);
        }
    });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,DataStruct.class);
                startActivity(a);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,Python.class);
                startActivity(a);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,Rprog.class);
                startActivity(a);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,Computing.class);
                startActivity(a);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Prog.this,Compiler.class);
                startActivity(a);
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
