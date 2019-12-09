package com.company.Firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//getting the resource from xml file 
       Resource res=new ClassPathResource("spring.xml");
       
       //A BeanFactory is like a factory class that contains a collection of beans act as CONTAINER
       BeanFactory bf=new XmlBeanFactory(res);
       
       //from factory we will ask to give the bean with id as id1
       Hellobean hb=bf.getBean("id1",Hellobean.class);
       
       //asking to dispaly the message
       hb.display();;
    }
}
