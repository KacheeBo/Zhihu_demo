package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryById(String username,String password);
    void save(String username,String password);
    User getUsername(String username);
}
