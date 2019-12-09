package com.company.Firstspring;

public class Hellobean 
{
	private String message;

	//this ids of type setter injection
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void display()
	{
		System.out.println("----message----\n"+message);
	}
	
	

}
