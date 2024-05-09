package com.example.demo.mapper;

import com.example.demo.entity.Info;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoMapper {
    List<Info> queryAll(int userid);
//    void updateInfo(Info info);

}

