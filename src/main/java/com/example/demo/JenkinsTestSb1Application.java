package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestSb1Application {

	@GetMapping("/home")
	public String home() {
		return "this endpoint is working fine..........";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestSb1Application.class, args);
		System.out.println("Application is running......");
	}

}
