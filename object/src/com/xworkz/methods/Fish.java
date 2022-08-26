package com.xworkz.methods;

public class Fish {
	
	public  String breed;
	public String type;
	
	public Fish()  //Default Constructor
	{
		System.out.println("Default Constructor");	
	}

	public Fish(String bread, String type) // method
	{
		this.breed = bread;
		this.type = type;
		
		System.out.println("*-----Bread of fish is-----*>>>>>"+breed);
		System.out.println("*-----Type of fish living in-----*>>>>>"+type);
	}
	
	//getter
	
	public String getbreed()
	{
		System.out.println("-----Scad Fish-----");
		return breed;
	}
	
	public String gettype()
	{
		System.out.println("-----Salt Water-----");
		return type;
	}	
	
	@Override
	public String toString()
	{
		System.out.println("Method of Override");
		return super.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("Object is a null");
		}
		if(obj instanceof Fish)
		{
			System.out.println("Object is a fish");
			Fish converted=(Fish)obj; //Type Casting Method
			String convertedBreed=converted.breed;
			String convertedType=converted.type;
			if(this.breed.equals(convertedBreed) && this.type.equals(convertedType))
				
				System.out.println("---Scad Fish Is Equal---");
				return true;
		}
		
		return super.equals(obj);
	}
	
	
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
