package com.example.SabloaneProiectare;

import java.util.List;

public class Image implements Element, Picture {
    private String url;
    private Dimension dim;
    private ImageContent content;

    public Image(String url, Dimension dim,  ImageContent content) {
        this.url = url;
        this.dim = new Dimension(1920, 1080);
        this.content = new ImageContent("Image content: " + url);
    }

    public Image(String url){
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
        System.out.println("Image with name: " + url);
    }

    @Override
    public Dimension dim() {
        return dim;
    }
    @Override
    public ImageContent content() {
        return content;
    }

    @Override
    public String url() {
        return url;
    }

}