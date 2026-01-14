package com.example.claseInyec10Sping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.claseInyec10Sping.model.Comment;

import com.example.claseInyec10Sping.model.Post;
import com.example.claseInyec10Sping.repository.CommentRepository;
import com.example.claseInyec10Sping.repository.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository,
            PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public Comment crear(Comment comment, Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post no encontrado"));

        comment.setPost(post);
        return commentRepository.save(comment);
    }
}
