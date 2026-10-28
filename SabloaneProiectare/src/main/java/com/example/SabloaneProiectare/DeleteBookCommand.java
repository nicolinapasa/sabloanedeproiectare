
package com.example.SabloaneProiectare;

public class DeleteBookCommand implements Command {

    private final CommandContext context;
    private final Integer id;

    public DeleteBookCommand(CommandContext context, Integer id) {
        this.context = context;
        this.id = id;
    }

    @Override
    public Object execute() {
        context.getBooksRepository().deleteById(id);
        return "Book deleted";
    }
}
