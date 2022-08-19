package com.xworks.inheritance.parent;

public class Planet {
	
	public String color;
	public double distanceFromEarth;
	public boolean waterInPlanet;
	
	public Planet(String color,double distanceFromEarth,boolean waterInPlanet)
	{
		System.out.println("Constructer with in Planet");
		
	  this.color=color;
	  this.distanceFromEarth=distanceFromEarth;
	  this.waterInPlanet=waterInPlanet;
	  
	  
	}

}
