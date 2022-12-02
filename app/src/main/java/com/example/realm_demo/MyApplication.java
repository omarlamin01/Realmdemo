package com.example.realm_demo;

import android.app.Application;

public class MyApplication extends Application {
    private Realm realm;

    @Override
    public void onCreate() {
        super.onCreate();
        realm = Realm.getInstance();
    }
}
