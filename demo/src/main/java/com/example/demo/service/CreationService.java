package com.example.demo.service;

import com.example.demo.entity.Creation;
import com.example.demo.mapper.CreationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreationService {

    @Autowired
    public CreationMapper creationmapper;
    public List<Creation> queryAllCreation(int userid){
        List<Creation> intro = null;
        try{
            intro = creationmapper.queryAllCreation(userid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return intro;
    }

    public void updateCreation(Creation creation){
        try{
            creationmapper.updateCreation(creation);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
