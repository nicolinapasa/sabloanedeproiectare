
package com.example.SabloaneProiectare;

import java.util.List;

public class GetAllBooksCommand implements Command {

    private final CommandContext context;

    public GetAllBooksCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public List<Book> execute() {
        return context.getBooksRepository().findAll();
    }
}
