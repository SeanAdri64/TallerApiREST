package com.example.claseInyec10Sping.service;

import java.util.List;

import com.example.claseInyec10Sping.model.Author;

public interface AuthorService {

    Author crear(Author author);

    List<Author> listar();
}
