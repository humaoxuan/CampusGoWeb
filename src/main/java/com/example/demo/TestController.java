package com.example.demo;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.example.demo.Service.UserService;
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

    @RequestMapping(value =  "/getVeryfyCode")
    public User getVeryfyCode(String phone){

//        生成验证码
        String veryfyCode = String.valueOf((int)(Math.random()*10e3));
        while (veryfyCode.length()<4){
            StringBuffer stringBuffer = new StringBuffer(veryfyCode);
            stringBuffer.insert(0,0);
            veryfyCode = stringBuffer.toString();
        }

//       持久化验证码，把验证码放入数据库
        User user = userService.getUserByPhone(phone);
        if(null == user){
            user = userService.getUserById(3);
        }
        user.setPhone(phone);
        user.setVeryfication_code(veryfyCode);
        userService.updateUser(user);
        System.out.println(veryfyCode);

////        发送短信验证码，使用的阿里sdk
//        SmsUtil smsUtil = new SmsUtil();
//        SendSmsResponse response = null;
//        try {
//            response = smsUtil.sendSms(phone, veryfyCode);
//        } catch (ClientException e) {
//            e.printStackTrace(); }
//
//        if(response!=null) {
//            System.out.println("短信接口返回的数据----------------");
//            System.out.println("Code=" + response.getCode());
//            System.out.println("Message=" + response.getMessage());
//            System.out.println("RequestId=" + response.getRequestId());
//            System.out.println("BizId=" + response.getBizId());
//        }
       return user;
    }
}
