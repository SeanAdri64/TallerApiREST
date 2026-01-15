package com.example.claseInyec10Sping.controller;

import com.example.claseInyec10Sping.model.Post;
import com.example.claseInyec10Sping.service.PostService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // POST /posts
    @PostMapping
    public Post crear(@Valid @RequestBody Post post) {
        return postService.crear(post, null);
    }

    // GET /posts
    @GetMapping
    public List<Post> listar() {
        return postService.listar();
    }

    // GET /posts/{id}
    @GetMapping("/{id}")
    public Post obtener(@PathVariable Long id) {
        return postService.obtenerPorId(id);
    }

    // PUT /posts/{id}
    @PutMapping("/{id}")
    public Post actualizar(@PathVariable Long id, @Valid @RequestBody Post post) {
        return postService.actualizar(id, post);
    }

    // DELETE /posts/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        postService.eliminar(id);
    }
}

