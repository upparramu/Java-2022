package com.xworkz.abstraction;

public abstract class Gravity {
	
	private double gravity;
	
	public Gravity() 
	{
           System.out.println("Default constructor in Gravity");
	}
	
	public Gravity(double gravity) {
		this.gravity = gravity;
	}
	
	public abstract void show();

	public double getGravity() {
		return 9.81d;
	}
	public double getGravity(double hf) {
		return 9.631d;
	}


	public void setGravity(double gravity) {
		this.gravity = gravity;
	}

	@Override
	public String toString() {
		return "Gravity [gravity=" + gravity + "]";
	}


	
	
	
	
	
	

}
