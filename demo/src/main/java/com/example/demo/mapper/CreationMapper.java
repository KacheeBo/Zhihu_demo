package com.example.demo.mapper;

import com.example.demo.entity.Creation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CreationMapper {
    List<Creation> queryAllCreation(int userid);
    void updateCreation(Creation creation);
}
