
package com.example.SabloaneProiectare;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BaseElement> children = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        children.add((BaseElement) element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Element element : children) {
            element.accept(visitor);
        }
    }

    public void render() {
        System.out.println("Section: " + title);
    }

    public String getTitle() {
        return title;
    }

    public List<BaseElement> getChildren() {
        return children;
    }
}
