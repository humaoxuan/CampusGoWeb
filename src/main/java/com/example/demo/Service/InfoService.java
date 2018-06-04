package com.example.demo.Service;

import com.example.demo.model.Information;
import com.example.demo.model.User;

import java.util.List;

public interface InfoService {
    public boolean insertInfo(Information information);

    public List<Information> queryInfoLimit20(int startIndex);
}
