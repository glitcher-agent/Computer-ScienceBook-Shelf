package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DAA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da);
    }
    public void pdf4(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://labs.xjtudlc.com/labs/wldmt/reading%20list/books/Algorithms%20and%20optimization/Introduction%20to%20Algorithms.pdf"));
        startActivity(pdfintent);

    }

    public void pdf5(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cse.iitd.ernet.in/~ssen/csl356/root.pdf"));
        startActivity(pdfintent);

    }

    public void pdf6(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pdfs.semanticscholar.org/9274/7531c34036a3bc8b83dfc674a8b3c86ef737.pdf"));
        startActivity(pdfintent);

    }


}
