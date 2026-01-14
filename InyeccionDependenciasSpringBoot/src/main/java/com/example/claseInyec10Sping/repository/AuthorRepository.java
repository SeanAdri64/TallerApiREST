package com.example.claseInyec10Sping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.claseInyec10Sping.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
