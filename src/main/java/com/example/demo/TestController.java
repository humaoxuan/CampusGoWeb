package com.example.demo;

import com.example.demo.Service.UserService;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.mapper.base.UserBaseMapper;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello")
    public User hello(){
        User user = userService.getUserById(1);
        return user;
    }
}
