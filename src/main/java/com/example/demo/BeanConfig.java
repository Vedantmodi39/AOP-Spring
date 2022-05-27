package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.example.demo")// aa packge na drek component scan krse
@EnableAspectJAutoProxy
public class BeanConfig {

}
