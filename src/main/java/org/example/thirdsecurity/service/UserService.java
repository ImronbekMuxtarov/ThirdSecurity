package org.example.thirdsecurity.service;

import lombok.RequiredArgsConstructor;
import org.example.thirdsecurity.entity.User;
import org.example.thirdsecurity.enums.Role;
import org.example.thirdsecurity.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder encoder;
    private final UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User addUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }
}
