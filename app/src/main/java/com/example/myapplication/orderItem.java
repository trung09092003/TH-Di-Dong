package com.example.myapplication;

public class orderItem {
    String title05,price05;
    Integer image05;

    public orderItem(String title, String price, Integer image) {
        this.title05 = title;
        this.price05 = price;
        this.image05 = image;
    }

    public String getTitle() {
        return title05;
    }

    public void setTitle(String title) {
        this.title05 = title;
    }

    public String getPrice() {
        return price05;
    }

    public void setPrice(String price) {
        this.price05 = price;
    }

    public Integer getImage() {
        return image05;
    }

    public void setImage(Integer image) {
        this.image05 = image;
    }
}
