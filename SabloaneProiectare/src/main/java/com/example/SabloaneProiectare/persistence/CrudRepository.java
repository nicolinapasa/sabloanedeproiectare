package com.example.SabloaneProiectare.persistence;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {

    T save(T entity);

    List<T> findAll();

    Optional<T> findById(ID id);

    void deleteById(ID id);
}