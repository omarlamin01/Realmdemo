package com.example.realm_demo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.realm_demo.R;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        realm = Realm.getDefaultInstance();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}