package com.example.SabloaneProiectare.controllers;

import com.example.SabloaneProiectare.difexamples.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClientComponent clientComponent1;
    private final ClientComponent clientComponent2;

    @Autowired
    public HelloController(
            ClientComponent clientComponent1,
            ClientComponent clientComponent2) {

        this.clientComponent1 = clientComponent1;
        this.clientComponent2 = clientComponent2;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/client")
    public String client() {
        return "Hello from ClientComponent1 = "
                + clientComponent1 + "\n"
                + "Hello from ClientComponent2 = "
                + clientComponent2;
    }
}