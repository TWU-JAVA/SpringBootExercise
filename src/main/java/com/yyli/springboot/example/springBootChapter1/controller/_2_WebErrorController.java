package com.yyli.springboot.example.springBootChapter1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class _2_WebErrorController {
    @RequestMapping("error")
    public String errorIndex(){
        throw new RuntimeException("runtime error");
    }

}
