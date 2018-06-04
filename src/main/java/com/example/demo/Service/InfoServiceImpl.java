package com.example.demo.Service;

import com.example.demo.mapper.InformationMapper;
import com.example.demo.model.Information;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("InfoService")
public class InfoServiceImpl implements  InfoService{

    @Resource
    private InformationMapper infoDao;

    @Override
    public boolean insertInfo(Information information) {

        infoDao.insertInformation(information);
        return false;
    }

    @Override
    public List<Information> queryInfoLimit20(int startIndex) {
        return infoDao.queryInformationLimit20(startIndex);
    }
}
