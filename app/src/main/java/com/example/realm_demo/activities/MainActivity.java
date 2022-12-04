package com.example.realm_demo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.realm_demo.R;
import com.example.realm_demo.models.Achat;
import com.example.realm_demo.models.Product;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();

        Product produit = realm.createObject(Product.class, 2L);
        produit.setP_intitule("Ordinateur HP");
        produit.setP_prix(5);

        Product produit1 = realm.createObject(Product.class, 3L);
        produit.setP_intitule("Ordinateur HP");
        produit.setP_prix(5);

        Achat achat = realm.createObject(Achat.class);
        achat.addProduct(produit);
        achat.addProduct(produit1);

        realm.commitTransaction();
        RealmResults<Product> results = realm
                .where(Product.class)
                .findAll();
        for (Product item : results) {
            System.out.println("****************************" + item.toString());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
