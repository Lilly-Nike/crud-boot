package org.example.crud.dao;

import org.example.crud.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void update(User user);
    void delete(User user);
}
