package com.example.baitapthietke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.baitapthietke.Fragment.SignUpFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignUpFragment signUpFragment = new SignUpFragment();
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().add(R.id.Frame,signUpFragment).commit();
    }
}