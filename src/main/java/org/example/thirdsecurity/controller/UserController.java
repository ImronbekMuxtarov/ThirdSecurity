package org.example.thirdsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.example.thirdsecurity.entity.User;
import org.example.thirdsecurity.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> getUsers(){
        return service.getUsers();
    }
}
