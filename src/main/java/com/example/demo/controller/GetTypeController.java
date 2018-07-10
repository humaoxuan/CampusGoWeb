package com.example.demo.controller;

import com.example.demo.mapper.TypeMapper;
import com.example.demo.model.Type;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GetTypeController {

    @Resource
    private TypeMapper typeMapper;

    @RequestMapping("/getType")
    public List<Type> getType(){
        List<Type> typeList=typeMapper.queryType();
        return typeList;
    }
}
