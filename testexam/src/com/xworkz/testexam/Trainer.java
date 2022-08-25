package com.xworkz.testexam;

public class Trainer {

	
	public String name;
	public int experience;
	public String specialzation;
	
	public Trainer() 
	{
		System.out.println("*-----Trainer is a default constructor-----*");
	}
	
	public Trainer(String name, int experience, String specialzation )
	{
		this.name=name;
		this.experience=experience;
		this.specialzation=specialzation;
		
	}
	
	public boolean setTraining()
	{
		System.out.println("*-----Java Training classes held on daily basis-----*");
		
		return true;
	}
	
	public boolean setConductInterview()
	{
		System.out.println("*-----in x-workz conducting mock interviews-----*");
		
		return true;
	}
	
	public boolean setCoding()
	{
		System.out.println("*-----on basis of java coding we have tasks on daily basis");
		
		return true;
	}
	
	
}
