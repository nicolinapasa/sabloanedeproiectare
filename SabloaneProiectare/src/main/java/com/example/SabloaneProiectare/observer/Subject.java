
package com.example.SabloaneProiectare.observer;

import com.example.SabloaneProiectare.Book;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(Book book);
}
