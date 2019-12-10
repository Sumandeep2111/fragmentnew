package com.example.fragmentdemo;

import android.icu.text.Transliterator;

public class position {

    private String title;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    private String description;

    public position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public  static final position[] position = {
            new position("ios developer","developing ios application"),
            new position("java developer","developing java application"),
            new position("database developer","developing database application")
    };

}
