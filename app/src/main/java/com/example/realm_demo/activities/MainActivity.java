package com.example.realm_demo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.realm_demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}