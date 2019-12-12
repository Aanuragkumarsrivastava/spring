package com.company.firstautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        
        Car driver=ac.getBean("id2",Car.class);
        driver.start();
    }
}
