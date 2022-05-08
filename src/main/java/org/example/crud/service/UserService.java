package org.example.crud.service;

import org.example.crud.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
