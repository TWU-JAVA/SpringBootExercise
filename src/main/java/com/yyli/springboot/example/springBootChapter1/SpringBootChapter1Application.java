package com.yyli.springboot.example.springBootChapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/*
* @ServletComponentScan 此注解可以使得，filter，listener，servlet可以直接使用@WebServlet、@WebFilter、@WebListener 注解自动注册
* */
@ServletComponentScan
@SpringBootApplication
public class SpringBootChapter1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootChapter1Application.class, args);
		System.out.println("hello! console ! main function.");
	}
}
