package com.example.demo.Service;

import com.example.demo.mapper.TypeMapper;
import com.example.demo.model.Type;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("TypeService")
public class TypeServiceImpl implements TypeService{

    @Resource
    private TypeMapper typeDao;

    @Override
    public List<Type> getType() {
        List<Type> typeList = typeDao.queryType();
        return typeList;
    }
}
