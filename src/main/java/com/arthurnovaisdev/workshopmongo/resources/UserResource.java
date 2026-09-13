package com.arthurnovaisdev.workshopmongo.resources;

import com.arthurnovaisdev.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User arthur = new User("1", "Arthur Novais", "arthurnovais@gmail.com");
        User luiza = new User("2", "Luiza Fernandes", "luizafernandes@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(arthur, luiza));
        return ResponseEntity.ok().body(list);
    }
}
