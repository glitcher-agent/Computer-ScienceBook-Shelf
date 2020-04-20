package com.example.aditya.homepage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class Cprog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprog);
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
    public void pdf(View view)
    {
        Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://karadev.net/uroci/filespdf/files/a%20book%20on%20c.pdf"));
        startActivity(a);
    }
    public void onc(View view)
     {
         Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://lepointdeau.fr/LIVRES/Programming%20in%20C,%202nd%20Edition.pdf"));
         startActivity(a);
     }
     public void hard(View view){
         Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ptgmedia.pearsoncmg.com/images/9780321884923/samplepages/9780321884923.pdf"));
         startActivity(a);
     }
}
