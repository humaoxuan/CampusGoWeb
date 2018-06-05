package com.example.demo.controller;

import com.example.demo.Service.InfoService;
import com.example.demo.Service.UserService;
import com.example.demo.model.Information;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GetUserControlloer {
    @Resource
    UserService userService;

    @RequestMapping(value = "/getUserById")
    public User getInfo(int id){
        User user = userService.getUserById(id);
        return user;
    }
}
