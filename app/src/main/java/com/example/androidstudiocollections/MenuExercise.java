package com.example.androidstudiocollections;

import static android.graphics.Color.WHITE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuExercise extends AppCompatActivity {

    Button btnChanger;
    ConstraintLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransforming);
        container = findViewById(R.id.container);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }

    public void resetUI() {

        btnChanger.setVisibility(View.VISIBLE);
        btnChanger.setAlpha(1.0f);


            btnChanger.setBackgroundColor(Color.parseColor("#FFFF0000"));




        btnChanger.setX(450);
        btnChanger.setY(1000);
        container.setBackgroundColor(Color.WHITE);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.setBtnInvis)
        {
            btnChanger.setAlpha(0);
        } else if (item.getItemId() == R.id.setChangeBtnColor) {
            btnChanger.setBackgroundColor(WHITE);
        } else if (item.getItemId() == R.id.setBtnPos) {
            btnChanger.setX(10);
            btnChanger.setY(10);
        }
        else if(item.getItemId() == R.id.setBtnDimension){
            btnChanger.setBackgroundResource(R.drawable.affliction);
        }
        else if(item.getItemId() == R.id.setChangeText){
            btnChanger.setText("Jake Bajo");
        }
        else if(item.getItemId() == R.id.mItemExit){
            finish();
        }
        else if(item.getItemId() == R.id.mItemReset){
            resetUI();
        }

        return true;
    }
}