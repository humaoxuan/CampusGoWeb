package com.example.demo.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;


    public User getUserById(int userId) {
        return userDao.queryUserLimit1(userId);
    }

    public User getUserByPhone(String phone) {
        return userDao.queryUserByPhoneLimit1(phone);
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

    public boolean updateUser(User user) {
        boolean result = false;
        try{
            userDao.updateUser(user);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}