package com.example.SabloaneProiectare;

import java.util.List;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void remove(Element element) {
    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Image " + url);
    }
}