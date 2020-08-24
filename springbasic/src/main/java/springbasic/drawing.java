package springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class drawing 
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		triangle t=ac.getBean("id1",triangle.class);
		t.showprogress();
	}
}
