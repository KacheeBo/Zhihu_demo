package com.example.demo.controller;

import com.example.demo.entity.Creation;
import com.example.demo.entity.Info;
import com.example.demo.entity.User;
import com.example.demo.service.CreationService;
import com.example.demo.service.InfoService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class InfoController {
    int userid;

    @Autowired
    UserService userService;

    @Autowired
    InfoService infoService;

    @Autowired
    CreationService creationService;

    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user;
        user = userService.queryById(username,password);
        if (user==null) {
            return "error";
        }else{
            userid = user.getId();
            System.out.println("username=" + username + ";password=" + password);
            return "1";
        }
    }

    //用户注册
    @RequestMapping("register")
    @ResponseBody
    public String register(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("username="+username + "password="+password);
        if (userService.getUsername(username)==null) {
            userService.save(username, password);
            return "1";
        }else{
            return "false";
        }
    }

    //显示出个人信息
    @RequestMapping("/Info")
    @ResponseBody
    public List<Info> getInfo(){
        System.out.println(infoService.queryAll(userid));
//        System.out.println("111");
        return infoService.queryAll(userid);
    }
    //查询个人创造
    @RequestMapping("/Creation")
    @ResponseBody
    public List<Creation> getIntro(){
        System.out.println(creationService.queryAllCreation(userid));
        return  creationService.queryAllCreation(userid);
    }
    //编辑个人创造
    @RequestMapping("/CreationUpdate")
    @ResponseBody
    public void updateIntro(Creation creation){
        creation.setCreatid(userid);
        creationService.updateCreation(creation);
        System.out.println(creation);
    }
}
