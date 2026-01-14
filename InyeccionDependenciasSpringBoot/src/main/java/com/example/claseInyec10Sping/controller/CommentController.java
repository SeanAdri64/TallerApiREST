package com.example.claseInyec10Sping.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claseInyec10Sping.model.Comment;
import com.example.claseInyec10Sping.service.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/post/{postId}")
    public Comment crear(@PathVariable Long postId,
            @Valid @RequestBody Comment comment) {
        return commentService.crear(comment, postId);
    }
}
