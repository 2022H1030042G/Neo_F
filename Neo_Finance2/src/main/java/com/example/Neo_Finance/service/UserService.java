package com.example.Neo_Finance.service;

import com.example.Neo_Finance.domain.User;
import com.example.Neo_Finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void saveAll(List<User> users) {
        userRepository.saveAll(users);
        userRepository.flush();
    }
}
