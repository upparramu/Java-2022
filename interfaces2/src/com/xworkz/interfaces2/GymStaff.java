package com.xworkz.interfaces2;

public class GymStaff {

	
	private GymRule gymRule;

	public GymStaff(GymRule gymrule) {
		System.out.println("Default constructor of GymRule");
		this.gymRule = gymRule;
	}
	
 public void checker()
 {
	boolean wearShoes= this.gymRule.wearingShoe();
	double montlyFees= this.gymRule.montlyFees();
	boolean uniSex= this.gymRule.uniSex();
if(wearShoes  && uniSex && montlyFees>400)
{
	System.out.println("gym rules are following");
}
else {
	System.err.println("gym rules are not following");
}
 }
 
 
 
	
}
