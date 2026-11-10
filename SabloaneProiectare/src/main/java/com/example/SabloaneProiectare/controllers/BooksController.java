
package com.example.SabloaneProiectare.controllers;

import com.example.SabloaneProiectare.Book;
import com.example.SabloaneProiectare.CommandContext;
import com.example.SabloaneProiectare.CreateBookCommand;
import com.example.SabloaneProiectare.DeleteBookCommand;
import com.example.SabloaneProiectare.GetAllBooksCommand;
import com.example.SabloaneProiectare.GetBookByIdCommand;
import com.example.SabloaneProiectare.persistence.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.SabloaneProiectare.observer.AllBooksSubject;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CommandContext context;
    private final AllBooksSubject allBooksSubject;

    public BooksController(CrudRepository<Book, Integer> booksRepository,
                           AllBooksSubject allBooksSubject) {
        this.context = new CommandContext(booksRepository);
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getAll() {
        return (List<Book>) new GetAllBooksCommand(context).execute();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Integer id) {
        Book book = new GetBookByIdCommand(context, id).execute();

        if (book == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book savedBook = new CreateBookCommand(context, book).execute();
        allBooksSubject.add(savedBook);
        return ResponseEntity.ok(savedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        new DeleteBookCommand(context, id).execute();
        return ResponseEntity.ok("Book deleted");
    }


    @PutMapping("/{id}")
    public ResponseEntity<Book> update(
            @PathVariable Integer id,
            @RequestBody Book book) {

        Book updatedBook = new com.example.SabloaneProiectare.UpdateBookCommand(
                context, id, book).execute();

        if (updatedBook == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedBook);
    }

}
