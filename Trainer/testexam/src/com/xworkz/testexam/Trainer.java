package com.xworkz.testexam;

public class Trainer {

	
	protected String name;
	protected int experience;
	protected String specialzation;
	
	protected Trainer() 
	{
		System.out.println("*-----Trainer is a default constructor-----*");
	}
	
	protected Trainer(String name, int experience, String specialzation )
	{
		this.name=name;
		this.experience=experience;
		this.specialzation=specialzation;
		
	}
	
	protected boolean setTraining()
	{
		System.out.println("*-----Java Training classes held on daily basis-----*");
		
		return true;
	}
	
	protected boolean setConductInterview()
	{
		System.out.println("*-----in x-workz conducting mock interviews-----*");
		
		return true;
	}
	
	protected boolean setCoding()
	{
		System.out.println("*-----on basis of java coding we have tasks on daily basis");
		
		return true;
	}
	
	
}
