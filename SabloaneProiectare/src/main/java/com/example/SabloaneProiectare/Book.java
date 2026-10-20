package com.example.SabloaneProiectare;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        contents.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Element element : contents) {
            element.accept(visitor);
        }
    }

    @Override
    public void add(Element element) {
        addContent(element);
    }

    @Override
    public void remove(Element element) {
        contents.remove(element);
    }

    @Override
    public Element get(int index) {
        return contents.get(index);
    }

    public void render() {
        System.out.println("Book: " + title);

        System.out.println();
        System.out.println("Authors:");

        for (Author author : authors) {
            author.print();
        }
    }

    public String getTitle() {
        return title;
    }
}