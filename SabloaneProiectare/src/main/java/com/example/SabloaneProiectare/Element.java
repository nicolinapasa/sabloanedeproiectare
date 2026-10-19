package com.example.SabloaneProiectare;

public interface Element {

    public abstract void print();
    public abstract void add(Element element);
    public abstract void remove(Element element);
    public abstract Element get(int index);

}