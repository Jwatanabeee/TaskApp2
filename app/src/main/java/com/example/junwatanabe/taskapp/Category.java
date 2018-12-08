package com.example.junwatanabe.taskapp;

import java.io.Serializable;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Category extends RealmObject implements Serializable {
    private String category;

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

