package com.example.dell.myapplication;

public class poemData {
    private String title;
    private int image;
    public poemData() {
    }

    public poemData(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public int getimage() {
        return image;
    }

    public void setimage(int image) {
        this.image = image;
    }
}
