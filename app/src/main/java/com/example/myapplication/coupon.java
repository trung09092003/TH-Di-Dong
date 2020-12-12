package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class coupon extends AppCompatActivity implements View.OnClickListener{
    ImageView back05;
    Button tieptuc05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        back05=findViewById(R.id.back);
        tieptuc05=findViewById(R.id.tieptuc);
        back05.setOnClickListener(this);
        tieptuc05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==back05){
            Intent back=new Intent(coupon.this,Home.class);
            startActivity(back);
        }
        if (v==tieptuc05){
            Intent tieptuc=new Intent(coupon.this,Login_activity.class);
            startActivity(tieptuc);
        }
    }
}