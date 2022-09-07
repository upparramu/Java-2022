package com.xworkz.interfaces2;

public class GymRunner {

	public static void main(String[] args) {
		
		GymRule gymRule =new BalajiGYM();
		
		GymStaff gyms = new GymStaff(gymRule);
		

	}

}