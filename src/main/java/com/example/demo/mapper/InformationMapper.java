package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.model.Information;
import com.example.demo.mapper.base.InformationBaseMapper;
/**
*  @author author
*/
public interface InformationMapper extends InformationBaseMapper{

    public List<Information> queryInformationLimit20(@Param("startIndex") int startIndex);
}