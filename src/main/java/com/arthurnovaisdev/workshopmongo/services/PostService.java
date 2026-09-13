package com.arthurnovaisdev.workshopmongo.services;

import com.arthurnovaisdev.workshopmongo.domain.Post;
import com.arthurnovaisdev.workshopmongo.repository.PostRepository;
import com.arthurnovaisdev.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}