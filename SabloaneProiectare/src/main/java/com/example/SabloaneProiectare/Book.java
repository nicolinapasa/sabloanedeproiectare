
package com.example.SabloaneProiectare;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book implements Element {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<BaseElement> contents = new ArrayList<>();

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        contents.add((BaseElement) element);
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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<BaseElement> getContents() {
        return contents;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
