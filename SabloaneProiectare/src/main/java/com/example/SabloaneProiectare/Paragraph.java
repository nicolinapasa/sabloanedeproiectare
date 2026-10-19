package com.example.SabloaneProiectare;

import java.util.List;

import java.util.List;

public class Paragraph implements Element {

    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
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
        Context context = new Context(text);

        if(textAlignment != null) {
            textAlignment.render(this, context);
        } else {
            System.out.println("Paragraph: " + text);
        }

    }

    public void setAlignStrategy (AlignStrategy strategy) {
        this.textAlignment = strategy;
    }
}