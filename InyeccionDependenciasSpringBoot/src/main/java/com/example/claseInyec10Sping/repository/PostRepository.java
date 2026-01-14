package com.example.claseInyec10Sping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.claseInyec10Sping.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
