package com.yyli.springboot.example.springBootChapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChapter1Application.class, args);
		System.out.println("hello! console ! main function.");
	}
}
