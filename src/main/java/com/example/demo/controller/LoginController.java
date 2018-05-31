package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(value = "/veryfy")
    public boolean veryfy(){
        boolean ret = false;

        return ret;
    }
}
