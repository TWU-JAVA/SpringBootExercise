package com.yyli.springboot.example.springBootChapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class _0_HelloController {
    @RequestMapping("/hello")
    public String index(){
        System.out.println("hello");
        return "hello";
    }
}
