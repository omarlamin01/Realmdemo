package com.example.realm_demo.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Product extends RealmObject {
    @PrimaryKey
    private long id;
    @Required
    public String p_intitule;
    private float p_prix;
    private int id_image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getP_intitule() {
        return p_intitule;
    }

    public void setP_intitule(String p_intitule) {
        this.p_intitule = p_intitule;
    }

    public float getP_prix() {
        return p_prix;
    }

    public void setP_prix(float p_prix) {
        this.p_prix = p_prix;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }
}
