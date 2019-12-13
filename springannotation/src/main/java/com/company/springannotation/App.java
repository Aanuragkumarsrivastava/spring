package com.company.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	//here driver is the name of bean(name of class in spring is bean)
    	Driver d=ac.getBean("driver",Driver.class);
    	d.work();
    	
    }
}
