package com.company.springannotation;

import org.springframework.stereotype.Component;

@Component
public class Car
{
	public Car()
	{
		System.out.println("inside car");
	}
	public void start()
	{
		System.out.println("car started");
	}
	public void stop()
	{
		System.out.println("car stopped");
	}
}
