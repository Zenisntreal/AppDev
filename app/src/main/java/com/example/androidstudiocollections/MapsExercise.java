package com.example.androidstudiocollections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapsExercise extends AppCompatActivity {

    ImageButton mapsBtn1;

    ImageButton mapsBtn2;

    ImageButton mapsBtn3;

    ImageButton mapsBtn4;

    ImageButton mapsBtn5;

    ConstraintLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        mapsBtn1 = findViewById(R.id.mapsBtn1);
        mapsBtn2 = findViewById(R.id.mapsBtn2);
        mapsBtn3 = findViewById(R.id.mapsBtn3);
        mapsBtn4 = findViewById(R.id.mapsBtn4);
        mapsBtn5 = findViewById(R.id.mapsBtn5);

        bg = findViewById(R.id.bg);

        mapsBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.29447125047058,123.88114528573387"));
                startActivity(intentmaps);
                bg.setBackgroundResource(R.drawable.firstbg);
            }
        });
        mapsBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:14.582524574465477, 120.97887370328857"));
                startActivity(intentmaps);
                bg.setBackgroundResource(R.drawable.img);
            }
        });
        mapsBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.8584658424926, 2.294194851976939"));
                startActivity(intentmaps);
                bg.setBackgroundResource(R.drawable.paris);
            }
        });
        mapsBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.669938535861434, 139.70727579703933"));
                startActivity(intentmaps);
                bg.setBackgroundResource(R.drawable.japan);
            }
        });
        mapsBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:8.65276864157228, 123.42077794584478"));
                startActivity(intentmaps);
                bg.setBackgroundResource(R.drawable.jakeplace);
            }
        });
    }
}
