package com.example.mnk.arkidalgasi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView arkiler;
    ArrayList<String> isimler,Lakaplar;
    ArrayList<Bitmap> image;
    static Bitmap imageposition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arkiler=findViewById(R.id.listview);

        isimler = new ArrayList<>();

        isimler.add("Mert");
        isimler.add("Samet");
        isimler.add("Tolga");
        isimler.add("Oktay");
        isimler.add("Ali Osman");
        isimler.add("Ümit");
        isimler.add("Yunus");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,isimler);
        arkiler.setAdapter(arrayAdapter);

        Lakaplar = new ArrayList<>();
        Lakaplar.add("Muhafazakar");
        Lakaplar.add("Armut");
        Lakaplar.add("Langırt");
        Lakaplar.add("Kabak");
        Lakaplar.add("Pırasa");
        Lakaplar.add("Kivi");
        Lakaplar.add("Balon");

        Bitmap mert = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.muhafazakar);
        Bitmap Samet = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.armut);
        Bitmap Tolga = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.langirt);
        Bitmap Oktay = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kabak);
        Bitmap AliOsman= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pirasa);
        Bitmap Umit = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kivi);
        Bitmap Yunus = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.balon);


        image = new ArrayList<>();
        image.add(mert);
        image.add(Samet);
        image.add(Tolga);
        image.add(Oktay);
        image.add(AliOsman);
        image.add(Umit);
        image.add(Yunus);

        arkiler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),Detaylar.class);
                imageposition = image.get(position);
                i.putExtra("isim",Lakaplar.get(position));
                startActivity(i);
            }
        });


    }
}
