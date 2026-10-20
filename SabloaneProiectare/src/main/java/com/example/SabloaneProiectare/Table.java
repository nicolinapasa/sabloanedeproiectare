package com.example.SabloaneProiectare;

public class Table implements Element {

    private String something;

    public Table(String something) {
        this.something = something;
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
        System.out.println("Table: " + something);
    }
}