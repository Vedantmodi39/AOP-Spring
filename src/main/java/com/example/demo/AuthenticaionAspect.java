package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticaionAspect {

     @Pointcut("within(com.example.demo.*)")	
	 public void authenticatingpointcut()
	 {
		 System.out.println("pointcut 1");
	 }
     @Pointcut("within(com.example.demo.*)")	
	 public void authorizationpointcut()
	 {
    	 System.out.println("pointcut 2222");
	 }
	
     @Before("authenticatingpointcut() && authorizationpointcut()")
	public void aunthenticate()
	{
		System.out.println("authenticate request");
	}
}
