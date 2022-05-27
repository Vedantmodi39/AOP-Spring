package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopExample22Application {

	public static void main(String[] args) {
		//SpringApplication.run(AopExample22Application.class, args);
		 
		
		ApplicationContext context= new  AnnotationConfigApplicationContext(BeanConfig.class);
		// aa context mathi bean get karai skiae...	 
		
		ShoppingCart cart= context.getBean(ShoppingCart.class);
		cart.Checkout("cancelled");
		cart.quantity();
	}

	

}
