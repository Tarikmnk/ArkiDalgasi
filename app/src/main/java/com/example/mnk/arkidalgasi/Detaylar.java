package com.example.mnk.arkidalgasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Detaylar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaylar);

        Intent a = getIntent();
        String b = a.getStringExtra("isim");
        TextView textView = findViewById(R.id.textView);
        textView.setText(b);


        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(MainActivity.imageposition);
    }
}
