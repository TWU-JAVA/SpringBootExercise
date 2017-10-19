package com.yyli.springboot.example.springBootChapter1.controller;

import com.yyli.springboot.example.springBootChapter1.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/index")
public class _1_IndexController {
    @RequestMapping("get")
    public HashMap<String,Object> get(@RequestParam String name){
        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("title","I am get");
        map.put("name",name);

        return map;
    }

    @RequestMapping("get/{uId}/{uName}")
    public User getUser(@PathVariable int uId, @PathVariable String uName){
        User user = new User();
        SimpleDateFormat sd = new SimpleDateFormat("mm-dd-yyyy");

        user.setId(uId);
        user.setName(uName);
        user.setDate(sd.format(new Date()));

        return user;
    }
}
