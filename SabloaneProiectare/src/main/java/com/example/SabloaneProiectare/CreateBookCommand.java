
package com.example.SabloaneProiectare;

public class CreateBookCommand implements Command {

    private final CommandContext context;
    private final Book book;

    public CreateBookCommand(CommandContext context, Book book) {
        this.context = context;
        this.book = book;
    }

    @Override
    public Book execute() {
        return (Book) context.getBooksRepository().save(book);
    }
}
