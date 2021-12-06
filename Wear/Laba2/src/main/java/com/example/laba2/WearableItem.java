package com.example.laba2;

public class WearableItem {
    private String text;
    private int image;

    public WearableItem(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}