package com.example.claseInyec10Sping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.claseInyec10Sping.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
