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

	
	public String getName()
	{
		
		return name;
	}
	
	public int getexperience()
	{
		
		return experience;
	}
	public String getspecialzation()
	{
		
		return specialzation;
	}
	
	

}
