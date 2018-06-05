package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetTypeController {

    @RequestMapping("/getType")
    public List<String> getType(){
        List<String> typeList=null;
        return typeList;
    }
}
