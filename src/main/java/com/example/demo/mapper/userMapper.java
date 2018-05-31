package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.model.User;
import com.example.demo.mapper.base.UserBaseMapper;
/**
*  @author author
*/
public interface userMapper extends UserBaseMapper{

    int insertUser(User object);

    int updateUser(User object);

    List<User> queryUser(User object);

    User queryUserLimit1(int id);
}