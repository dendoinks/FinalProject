package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class category extends AppCompatActivity {
    FloatingActionButton back, histbtn;
    RelativeLayout beginner,intermediate,advanced;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        back = findViewById(R.id.back_btn);
        histbtn = findViewById(R.id.hist_btn);
        beginner = findViewById(R.id.beginner);
        intermediate = findViewById(R.id.intermediate);
        advanced = findViewById(R.id.advanced);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        histbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), history.class);
                startActivity(intent);
                finish();
            }
        });

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), beginner.class);
                startActivity(intent);
                finish();
            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), intermediate.class);
                startActivity(intent);
                finish();
            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), advanced.class);
                startActivity(intent);
                finish();
            }
        });

    }
}