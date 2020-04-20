package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cloud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud);
    }
    public void pdf1(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.immagic.com/eLibrary/ARCHIVES/EBOOKS/I111025E.pdf "));
        startActivity(pdfintent);

    }

    public void pdf2(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://chettinadtech.ac.in/storage/13-01-21/13-01-21-08-33-12-1373-mahendra.pdf"));
        startActivity(pdfintent);

    }
    public void pdf3(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://faculty.pucit.edu.pk/fawaz/s14/cs595/lectures/Overview.pdf"));
        startActivity(pdfintent);

    }
}
