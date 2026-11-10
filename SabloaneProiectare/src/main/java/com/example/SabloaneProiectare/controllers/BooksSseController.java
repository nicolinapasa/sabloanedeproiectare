
package com.example.SabloaneProiectare.controllers;

import com.example.SabloaneProiectare.observer.AllBooksSubject;
import com.example.SabloaneProiectare.observer.SseObserver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping("/books-sse")
    public SseEmitter getBooksSse() {

        final SseEmitter emitter = new SseEmitter(0L);

        SseObserver observer = new SseObserver(emitter);

        allBooksSubject.attach(observer);

        emitter.onCompletion(() -> allBooksSubject.detach(observer));
        emitter.onTimeout(() -> allBooksSubject.detach(observer));
        emitter.onError(error -> allBooksSubject.detach(observer));

        return emitter;
    }
}
