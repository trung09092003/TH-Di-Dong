package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Details extends AppCompatActivity {
    ImageView back05,image05;
    TextView title05,text05,title_bar05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        back05=findViewById(R.id.back);
        image05=findViewById(R.id.image);
        title05=findViewById(R.id.title);
        title_bar05=findViewById(R.id.title_bar);
        text05=findViewById(R.id.text);
        Intent intent=getIntent();
        text05.setText(intent.getStringExtra("text"));
        title05.setText(intent.getStringExtra("title"));
        title_bar05.setText(intent.getStringExtra("title"));
        image05.setImageResource(intent.getIntExtra("image",0));
        back05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Details.this,Home.class);
                startActivity(intent1);
            }
        });
    }
}