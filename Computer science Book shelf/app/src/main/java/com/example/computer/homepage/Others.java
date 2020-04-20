package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Others extends AppCompatActivity {
    private CardView cardView1,cardView2,cardView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        cardView1 = (CardView) findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Cloud.class);
                startActivity(intent);
            }
        });
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,DAA.class);
                startActivity(intent);
            }
        });
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,DBMS.class);
                startActivity(intent);
            }
        });

    }

}
