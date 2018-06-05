package com.example.demo.controller;

import com.example.demo.model.Type;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GetTypeController {

    @Resource
    private

    @RequestMapping("/getType")
    public List<Type> getType(){
        List<Type> typeList=null;
        return typeList;
    }
}
