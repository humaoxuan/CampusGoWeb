package com.example.demo.controller;

import com.example.demo.Service.InfoService;
import com.example.demo.model.Information;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GetInfoControlloer {
    @Resource
    InfoService infoService;

    @RequestMapping(value = "/getInfo")
    public List<Information> getInfo(int startIndex){
        List<Information> list = infoService.queryInfoLimit20(startIndex);
        System.out.println(list.size());
        return list;
    }
}
