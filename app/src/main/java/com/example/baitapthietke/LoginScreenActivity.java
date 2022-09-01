package com.example.baitapthietke;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_activity);

        TextView login = findViewById(R.id.tv2);
        login.setOnClickListener(v -> {
            startActivity(new Intent(this, UpdateUserActivity.class));
        });
    }
}
