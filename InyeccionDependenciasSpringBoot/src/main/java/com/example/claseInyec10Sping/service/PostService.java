package com.example.claseInyec10Sping.service;

import java.util.List;

import com.example.claseInyec10Sping.model.Post;

public interface PostService {

    Post crear(Post post, Long authorId);

    List<Post> listar();

    Post obtenerPorId(Long id);

    Post actualizar(Long id, Post post);

    void eliminar(Long id);
}
