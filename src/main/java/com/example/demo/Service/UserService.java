package com.example.demo.Service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);

}