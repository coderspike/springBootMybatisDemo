package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //xml形式
    @Autowired
    private UserService userService;

    //注解形式
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findUser(@RequestParam(value = "name", required = true) String name) {
        return userService.findByName(name);
    }

    @RequestMapping(value = "/api/getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "name", required = true) String name) {
        return userMapper.findByName(name);
    }

}
