package com.example.claseInyec10Sping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.claseInyec10Sping.model.Author;
import com.example.claseInyec10Sping.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author crear(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> listar() {
        return authorRepository.findAll();
    }
}
