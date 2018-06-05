package com.example.demo.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.model.Type;
/**
*  @author author
*/
public interface TypeBaseMapper {

    int insertType(Type object);

    int updateType(Type object);

    List<Type> queryType();

    Type queryTypeLimit1(Type object);

}