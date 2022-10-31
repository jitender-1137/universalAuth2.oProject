package com.example.universalauth2.service;

import com.example.universalauth2.model.User;

import java.util.List;


public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
