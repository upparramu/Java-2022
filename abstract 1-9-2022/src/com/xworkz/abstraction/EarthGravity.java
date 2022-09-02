package com.xworkz.abstraction;

public class EarthGravity extends Gravity{

	public EarthGravity() {
		super();
	}

	public EarthGravity(double gravity) {
		super(gravity);
		
	}
	
	public void show() 
	{
		
		System.out.println(this.getGravity());
	}
	
	
	
	

}
