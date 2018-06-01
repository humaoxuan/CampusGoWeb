package com.example.demo.Service;

import com.example.demo.model.User;

public interface UserService {
    public User getUserById(int userId);

    public User getUserByPhone(String phone);

    public boolean updateUser(User user);

    boolean addUser(User record);

}