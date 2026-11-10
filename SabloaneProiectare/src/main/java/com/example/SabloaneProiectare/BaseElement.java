package com.example.SabloaneProiectare;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseElement implements Element {

    @Id
    @GeneratedValue
    private Integer id;

    public BaseElement() {
    }

    public Integer getId() {
        return id;
    }
}