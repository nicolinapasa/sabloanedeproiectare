package com.example.SabloaneProiectare;

import java.util.ArrayList;
import java.util.List;

public class Book {

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

    public void print() {

        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors:");

        for (Author author : authors) {
            author.print();
        }

        System.out.println();

        for (Element element : contents) {
            element.print();
        }
    }
}