package com.example.computer.butterknifeandfragments;

import android.graphics.drawable.Drawable;

public class MyData {
    private Drawable image;
    private String description;


    public MyData() {
    }

    public MyData(Drawable image, String description) {
        this.image = image;
        this.description = description;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
