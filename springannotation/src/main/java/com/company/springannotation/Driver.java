package com.company.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver
{
	@Autowired
	private Car c;
	
	public Driver(Car car)
	{
		super();
		System.out.println("inside driver constructor");
		this.c=car;
	}

	public void work() 
	{
		c.start();
	}
}
