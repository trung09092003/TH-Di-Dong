package com.example.myapplication;

public class item {
    String title05,text05,bt05;
    Integer image05;

    public item(String title, String text, String bt, Integer image) {
        this.title05 = title;
        this.text05 = text;
        this.image05 = image;
        this.bt05=bt;
    }

    public String getTitle() {
        return title05;
    }

    public void setTitle(String title) {
        this.title05 = title;
    }

    public String getText() {
        return text05;
    }

    public void setText(String text) {
        this.text05 = text;
    }

    public String getBt() {
        return bt05;
    }

    public void setBt(String bt) {
        this.bt05 = bt;
    }

    public Integer getImage() {
        return image05;
    }

    public void setImage(Integer image) {
        this.image05 = image;
    }
}
