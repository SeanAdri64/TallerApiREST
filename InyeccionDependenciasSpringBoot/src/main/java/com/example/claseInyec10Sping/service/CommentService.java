package com.example.claseInyec10Sping.service;

import com.example.claseInyec10Sping.model.Comment;

public interface CommentService {

    Comment crear(Comment comment, Long postId);
}
