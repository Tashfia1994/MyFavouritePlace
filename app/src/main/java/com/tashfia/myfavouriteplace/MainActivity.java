 package com.tashfia.myfavouriteplace;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {


Button btn_coxbazer,btn_saint,btn_bandarban,btn_shajek,btn_rangamati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_coxbazer=(Button)findViewById(R.id.btn_coxbazer);
        btn_bandarban=(Button)findViewById(R.id.btn_bandarban);
        btn_rangamati=(Button)findViewById(R.id.btn_rangamati);
        btn_saint=(Button)findViewById(R.id.btn_saint);
        btn_shajek=(Button)findViewById(R.id.btn_shajek);

        btn_coxbazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcox= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.coxsbazar.gov.bd/"));
                startActivity(intentcox);
                Toast.makeText(MainActivity.this, "Coxs Bazer", Toast.LENGTH_SHORT).show();
            }
        });

        btn_saint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsaint=new Intent(Intent.ACTION_VIEW,Uri.parse("http://visitbangladesh.gov.bd/beach-holiday/st-martins-island/"));
                startActivity(intentsaint);
                Toast.makeText(MainActivity.this, "Saint Martain", Toast.LENGTH_SHORT).show();
            }
        });
btn_rangamati.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intentrangamati=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rhdcbd.org/bn/"));
        startActivity(intentrangamati);
        Toast.makeText(MainActivity.this, "Rangamati", Toast.LENGTH_SHORT).show();
    }
});
btn_shajek.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intentshajek=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.beautifulchittagong.com/bangladesh/chittagong/sajek-valley"));
        startActivity(intentshajek);
        Toast.makeText(MainActivity.this, "Shajek", Toast.LENGTH_SHORT).show();
    }
});
btn_bandarban.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intentbandarban=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bandarban.gov.bd/"));
        startActivity(intentbandarban);
        Toast.makeText(MainActivity.this, "Bandarban", Toast.LENGTH_SHORT).show();
    }
});


    }
}
