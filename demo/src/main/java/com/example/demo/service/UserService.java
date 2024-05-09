package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public User queryById(String username, String password) {
        User user = null;
        try {
            user = mapper.queryById(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void save(String username, String password) {
        try {
            mapper.save(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public User getUsername(String username){
        User user = null ;
        try{
            user = mapper.getUsername(username);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
