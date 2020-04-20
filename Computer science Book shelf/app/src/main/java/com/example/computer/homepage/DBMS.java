package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DBMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);
    }
    public void pdf7(View view)
    {
        Intent pdfintent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://kakeboksen.td.org.uit.no/Database%20System%20Concepts%206th%20edition.pdf"));
        startActivity(pdfintent);
    }
    public void pdf8(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://noahc.me/Fundamentals%20of%20Database%20Systems%20(7th%20edition).pdf"));
        startActivity(pdfintent);
    }
    public void Pdf9(View view)
    {
        Intent pdfintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://pages.cs.wisc.edu/~dbbook/openAccess/thirdEdition/solutions/ans3ed-oddonly.pdf"));
        startActivity(pdfintent);
    }

}
