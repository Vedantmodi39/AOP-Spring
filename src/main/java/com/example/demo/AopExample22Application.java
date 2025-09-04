package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopExample22Application {

	public static void main(String[] args) {
		SpringApplication.run(AopExample22Application.class, args);
		System.out.println("--------Application Started-------");
	}

	

}
