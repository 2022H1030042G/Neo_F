package com.example.Neo_Finance.controller;

import com.example.Neo_Finance.domain.User;
import com.example.Neo_Finance.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NeoFinxController {
    private UserService userService;

    public NeoFinxController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public Iterable<User> list() {
       return userService.list();
    }
}