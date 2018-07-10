package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public User login(String phone, String veryfyCode){
        User user = userService.getUserByPhone(phone);
        if(user.getVeryfication_code().equals(veryfyCode))
            return user;
        user = userService.getUserById(3);
        return user;
    }
}
