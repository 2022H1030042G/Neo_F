package com.example.Neo_Finance.controller;

import com.example.Neo_Finance.domain.User;
import com.example.Neo_Finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private UserService service;

    @RequestMapping(path="/", method= RequestMethod.GET)
    public String list3(Model md){
        List<User> users = (List<User>) service.findAll();
        md.addAttribute("allusers", users);
        return "index";
    }
}