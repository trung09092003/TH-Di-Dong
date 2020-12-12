package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    Handler handler05;
    Runnable runnable;
    ImageView img05;
    Button bt05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        img05= findViewById(R.id.img);
        img05.animate().alpha(4000).setDuration(0);

        handler05 = new Handler();
        handler05.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dsp = new Intent(Welcome.this,Home.class);
                startActivity(dsp);
                finish();

            }
        },4000);

    }
}