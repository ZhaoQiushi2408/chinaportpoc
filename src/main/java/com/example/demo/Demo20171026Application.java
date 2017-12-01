package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo20171026Application {
	 
	
	@RequestMapping("/")
	public String hello() {
		return "s-----Jenkins---v2";
	}


	public static void main(String[] args) {
		SpringApplication.run(Demo20171026Application.class, args);
	}
}
