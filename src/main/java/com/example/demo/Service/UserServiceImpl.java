package com.example.demo.Service;

import com.example.demo.mapper.base.UserBaseMapper;
import com.example.demo.mapper.userMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private userMapper userDao;


    public User getUserById(int userId) {
        return userDao.queryUserLimit1(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insertUser(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}