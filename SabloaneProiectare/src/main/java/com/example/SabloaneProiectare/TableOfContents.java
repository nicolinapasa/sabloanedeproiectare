package com.example.SabloaneProiectare;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {

    private String something;
    private List<String> sections = new ArrayList<>();

    public TableOfContents(String something) {
        this.something = something;
    }

    public void addSection(String section) {
        sections.add(section);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
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

    public void render() {
        System.out.println("Table of Contents:");

        for (int i = 0; i < sections.size(); i++) {
            System.out.println((i + 1) + ". " + sections.get(i));
        }
    }
}