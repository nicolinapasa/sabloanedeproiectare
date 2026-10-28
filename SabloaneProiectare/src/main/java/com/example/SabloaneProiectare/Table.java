
package com.example.SabloaneProiectare;

import jakarta.persistence.Entity;

@Entity
public class Table extends BaseElement {

    private String something;

    public Table() {
    }

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

    public String getSomething() {
        return something;
    }
}
