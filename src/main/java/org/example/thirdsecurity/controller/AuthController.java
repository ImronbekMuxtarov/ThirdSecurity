package org.example.thirdsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.example.thirdsecurity.entity.User;
import org.example.thirdsecurity.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService service;

    @PostMapping
    public User signUp(@RequestBody User user){
        return service.addUser(user);
    }
}
