package com.xworkz.abstraction;

public class GravityRunner {

	public static void main(String[] args) {
		
		
	Gravity gravity = new EarthGravity();
	
	System.out.println(gravity.getGravity());
	

	EarthGravity gravity25 = new EarthGravity();
	
	System.out.println(gravity25.getGravity(65));
	
	
	gravity.setGravity(3.31);
	
	
	
}
}