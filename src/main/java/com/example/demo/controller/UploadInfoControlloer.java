package com.example.demo.controller;

import com.example.demo.Service.InfoServiceImpl;
import com.example.demo.model.Information;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
public class UploadInfoControlloer {
    //docker run --name=coolq --rm -p 8088:9000 -v /opt/coolq-data:/home/user/coolq -e VNC_PASSWD=humaoxuan1 -e COOLQ_ACCOUNT=1516737471 coolq/wine-coolq

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
}
