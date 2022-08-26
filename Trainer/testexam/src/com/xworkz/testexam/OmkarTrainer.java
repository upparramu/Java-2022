package com.xworkz.testexam;

public class OmkarTrainer extends Trainer{
	
	public OmkarTrainer()
	{
		System.out.println("*-----OmkarTrainer is a default constructor-----*");
	}
	
	public OmkarTrainer(String name, int experience, String specialzation)
	{
		super.name=name;
		super.experience=experience;
		super.specialzation=specialzation;
	}
	
	@Override
	
	public boolean setTraining()
	{
		return super.setTraining();
	}
	public boolean setConductInterview()
	
	{
		return super.setConductInterview();
	}
	public boolean setCoding()
	{
		return super.setCoding();
	}
	
	
	
//	Getter Method
//	Encapsulation
	
	public String getName()
	{
		super.name=name;
		return name;
	}
	
	public int getexperience()
	{
		super.experience=experience;
		return experience;
	}
	public String getspecialzation()
	{
		super.specialzation=specialzation;
		return specialzation;
	}
	
	

}
