package com.xworks.inheritence.cricket;

public class T20Cricket extends Cricket{
	
	
	public  String  manOfTheMatch()
	{
		return "M.S.Dhoni";
	}
	

 
	public boolean entertainment() 
	{
		System.out.println("Played matches are good");
		return true;
	}
	
	public void torisu()
	{
	
		System.out.println (entertainment());
		
	}
	
}
