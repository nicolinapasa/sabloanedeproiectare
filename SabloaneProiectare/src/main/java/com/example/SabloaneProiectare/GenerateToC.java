package com.example.SabloaneProiectare;

public class GenerateToC implements Visitor {

    private TableOfContents toc;

    public GenerateToC() {
        toc = new TableOfContents("");
    }

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        toc.addSection(section.getTitle());
    }

    @Override
    public void visit(Paragraph paragraph) {
    }

    @Override
    public void visit(Image image) {
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    }

    @Override
    public void visit(Table table) {
    }

    @Override
    public void visit(TableOfContents tableOfContents) {
    }

    public TableOfContents getToC() {
        return toc;
    }
}