
package com.example.SabloaneProiectare;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class Image extends BaseElement implements Picture {

    private String url;

    @Transient
    private Dimension dim;

    @Transient
    private ImageContent content;

    public Image() {
    }

    public Image(String url) {
        this.url = url;
        this.dim = new Dimension(1920, 1080);
        this.content = new ImageContent("Image content: " + url);
    }

    public Image(String url, Dimension dim, ImageContent content) {
        this.url = url;
        this.dim = dim;
        this.content = content;
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
        System.out.println("Image with name: " + url);
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    @Override
    public ImageContent content() {
        return content;
    }

    @Override
    public String url() {
        return url;
    }

    public String getUrl() {
        return url;
    }
}
