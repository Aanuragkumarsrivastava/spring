package com.company.firstautowire;

public class Driver
{
	private Car car;
	
	public void setCar(Car car)
	{
		this.car=car;
	}
	public void work()
	{
		car.start();
	}

}
