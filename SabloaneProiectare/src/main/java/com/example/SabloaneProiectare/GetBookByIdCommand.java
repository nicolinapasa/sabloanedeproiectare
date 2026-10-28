
package com.example.SabloaneProiectare;

public class GetBookByIdCommand implements Command {

    private final CommandContext context;
    private final Integer id;

    public GetBookByIdCommand(CommandContext context, Integer id) {
        this.context = context;
        this.id = id;
    }

    @Override
    public Book execute() {
        return context.getBooksRepository()
                .findById(id)
                .orElse(null);
    }
}
