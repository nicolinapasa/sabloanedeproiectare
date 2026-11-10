
package com.example.SabloaneProiectare;

import com.example.SabloaneProiectare.persistence.CrudRepository;

public class CommandContext {

    private final CrudRepository<Book, Integer> booksRepository;

    public CommandContext(CrudRepository<Book, Integer> booksRepository) {
        this.booksRepository = booksRepository;
    }

    public CrudRepository<Book, Integer> getBooksRepository() {
        return booksRepository;
    }
}
