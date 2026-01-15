package com.example.claseInyec10Sping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.claseInyec10Sping.model.Author;
import com.example.claseInyec10Sping.model.Post;

import com.example.claseInyec10Sping.repository.AuthorRepository;
import com.example.claseInyec10Sping.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public PostServiceImpl(PostRepository postRepository,
            AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Post crear(Post post, Long authorId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Autor no encontrado"));

        post.setAuthor(author);
        return postRepository.save(post);
    }

    @Override
    public List<Post> listar() {
        return postRepository.findAll();
    }

    @Override
    public Post obtenerPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPorId'");
    }

    @Override
    public Post actualizar(Long id, Post post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
}

