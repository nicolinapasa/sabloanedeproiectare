package com.example.SabloaneProiectare;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println(context.getText());
    }
}
