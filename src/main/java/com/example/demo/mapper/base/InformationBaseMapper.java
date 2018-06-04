package com.example.demo.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.model.Information;
/**
*  @author author
*/
public interface InformationBaseMapper {

    int insertInformation(Information object);

    int updateInformation(Information object);

    List<Information> queryInformation(Information object);

    Information queryInformationLimit1(Information object);

}