package com.example.apiconnectivity;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;
    private  int id;
    private String Title;
    @SerializedName("body")
    private String text;


    public Post() {
    }

    public Post(int userId, int id, String title, String text) {
        this.userId = userId;
        this.id = id;
        Title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
