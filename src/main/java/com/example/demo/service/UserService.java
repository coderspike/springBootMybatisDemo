package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
    User findByName(String name);
}
