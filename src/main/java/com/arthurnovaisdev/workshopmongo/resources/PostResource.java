package com.arthurnovaisdev.workshopmongo.resources;

import com.arthurnovaisdev.workshopmongo.domain.Post;
import com.arthurnovaisdev.workshopmongo.domain.User;
import com.arthurnovaisdev.workshopmongo.dto.UserDTO;
import com.arthurnovaisdev.workshopmongo.services.PostService;
import com.arthurnovaisdev.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
