package com.example.claseInyec10Sping.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claseInyec10Sping.model.Author;
import com.example.claseInyec10Sping.service.AuthorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author crear(@Valid @RequestBody Author author) {
        return authorService.crear(author);
    }

    @GetMapping
    public List<Author> listar() {
        return authorService.listar();
    }
}
