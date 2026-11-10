package com.example.SabloaneProiectare;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = context.getText();

        int spaces = 50 - text.length();

        if (spaces < 0) {
            spaces = 0;
        }

        System.out.println(" ".repeat(spaces) + text);
    }
}