package com.example.SabloaneProiectare;

import java.util.List;

public class TableOfContents implements Element {

    private String something;

    public TableOfContents(String something) {
        this.something = something;
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
        System.out.println("Table of contents: " + something);
    }
}