package com.example.baitapthietke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvButton = findViewById(R.id.tv);
        tvButton.setOnClickListener(v ->{
            startActivity(new Intent(this,LoginScreenActivity.class));
        });
    }
}