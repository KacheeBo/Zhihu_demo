package com.example.demo.service;

import com.example.demo.entity.Info;
import com.example.demo.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    @Autowired
    public InfoMapper mapper;
    public List<Info> queryAll(int userid){
        List<Info> info = null;
        try{
            info = mapper.queryAll(userid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return info;
    }

//    public void updateInfo(Info info){
//        try{
//            mapper.updateInfo(info);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}



