package com.arthurnovaisdev.workshopmongo.services;

import com.arthurnovaisdev.workshopmongo.domain.User;
import com.arthurnovaisdev.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
