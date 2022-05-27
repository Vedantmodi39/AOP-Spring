  package com.example.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.example.demo.ShoppingCart.Checkout(..))")
       public void beforeloggers(JoinPoint jp)
	{
		//System.out.println(jp.getSignature());
		String arg= jp.getArgs()[0].toString();
		System.out.println("before loggers with argument is: "+arg);
	}

	
	@After("execution(* *.*.*.*.Checkout(..))")
    public void afterloggers()
	{
		System.out.println("After loggers");
	}


//from this pointcut we have to execute and get varible as well
	@Pointcut("execution(* com.example.demo.ShoppingCart.quantity(..))")
	public void afterReturningPointcut()
	{
		System.out.println("isidnewngv");
	}
	
	@AfterReturning(pointcut = "afterReturningPointcut()" , returning ="retval")
	public void afteReturning(Object retval)	
  {
	System.out.println("after returning :"+ retval);
	
   }
}