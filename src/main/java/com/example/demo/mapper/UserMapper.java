package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.model.User;
import com.example.demo.mapper.base.UserBaseMapper;
/**
*  @author author
*/
public interface UserMapper extends UserBaseMapper{


    User queryUserLimit1(@Param("id") int id);

    User queryUserByPhoneLimit1(@Param("phone") String phone);

}