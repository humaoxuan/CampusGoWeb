package com.example.demo.controller;

import com.example.demo.Service.InfoServiceImpl;
import com.example.demo.model.Information;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
public class UploadInfoControlloer {

    @Resource
    InfoServiceImpl infoService;

    @RequestMapping(value = "/uploadInfo")
    public String uploadInfo(String info){
        Information information = new Information();
        information.setContent(info);
        information.setType("未分类");
        information.setTime(LocalDateTime.now());
        information.setUser_id(1);

        infoService.insertInfo(information);
        return null;
    }

    @RequestMapping(value = "/uploadInfoByUser")
    public String uploadInfoByUser(String info,int userId,String type){
        Information information = new Information();
        information.setContent(info);
        information.setType(type);
        information.setTime(LocalDateTime.now());
        information.setUser_id(userId);

        infoService.insertInfo(information);
        return null;
    }

}
