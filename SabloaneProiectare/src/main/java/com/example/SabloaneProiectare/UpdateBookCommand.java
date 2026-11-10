
package com.example.SabloaneProiectare;

public class UpdateBookCommand implements Command {

    private final CommandContext context;
    private final Integer id;
    private final Book updatedBook;

    public UpdateBookCommand(
            CommandContext context,
            Integer id,
            Book updatedBook) {
        this.context = context;
        this.id = id;
        this.updatedBook = updatedBook;
    }

    @Override
    public Book execute() {
        return context.getBooksRepository().findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    return context.getBooksRepository().save(book);
                })
                .orElse(null);
    }
}
