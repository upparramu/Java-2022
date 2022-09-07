package com.xworkz.interfaces2.pub;

public class CustomerPubRule implements PubRule{
	
	
	@Override
	public boolean dressCodeFollowed() {
	  System.out.println("---pub follows the dresscode---");
	
		return true;
	}
	
	@Override
	public int age() {
	System.out.println("---pub follows the age above 21years---");
	
		return 21;
	}
	
	public boolean validProof() {
	System.out.println("---while entering the pub valid proof is required---");
	
		return true;
	}

}


	
