package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(" ")
    public String home() {

        return "Spring Boot Working";
    }

    @GetMapping("pets")
    public List<String> getPets() {

        List<String> pets = new ArrayList<>();

        Dog dog = new Dog("Bruno", 3);

        Bird bird = new Bird("Kiwi", 2);

        pets.add(dog.displayDetails());

        pets.add(bird.displayDetails());

        return pets;
    }
}