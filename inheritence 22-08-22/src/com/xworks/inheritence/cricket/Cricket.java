package com.xworks.inheritence.cricket;

public class Cricket {
	String country;
	String captain;
	String gender;
	
	String setCountry(String country)
	{
		this.country=country;
		return country;
	}
	
	String setCaptain(String captain)
	{
		this.captain=captain;
		return captain;
	}
	String setGender(String gender)
	{
		this.gender=gender;
		return gender;
	}
	
	
	public boolean entertainment() 
	{
	 System.out.println("Played matched are well");	
	 return true;
	}

	double presentation(double price)
	{
		System.out.println("got Price of"+price);
		return price;
	}
	
	public void torisu()
	{
		System.out.println("country="+this.country);
		System.out.println("captain="+this.captain);
		System.out.println("gender="+this.gender);
	}

	public void manOfTheMatch(String string) {
		// TODO Auto-generated method stub
		
	}


		
	}


