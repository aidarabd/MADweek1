package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private TextView textView;
    private AppCompatImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (AppCompatImageView) findViewById(R.id.image);
        textView = (TextView)findViewById(R.id.textView);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId()==R.id.nav_rock){
                    image.setImageResource(R.drawable.rock);
                    textView.setText("rock");
                }
                else if(menuItem.getItemId()==R.id.nav_fire){
                    image.setImageResource(R.drawable.fire);
                    textView.setText("fire");
                }
                else if(menuItem.getItemId()==R.id.nav_water){
                    image.setImageResource(R.drawable.water);
                    textView.setText("water");
                }
                else if(menuItem.getItemId()==R.id.nav_wind){
                    image.setImageResource(R.drawable.wind);
                    textView.setText("wind");
                }
                return true;
            }
        });

    }
}
