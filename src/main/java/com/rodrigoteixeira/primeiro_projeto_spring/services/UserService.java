package com.rodrigoteixeira.primeiro_projeto_spring.services;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.User;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> user = userRepository.findById(id);

        return user.orElse(null);
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
