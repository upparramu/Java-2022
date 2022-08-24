package com.xworkz.parentclass;
public class autoMobileRunner {

	public static void main(String[] args) 
	{
		
      // AutoMobile automobile=new AutoMobile();
		
		HondaAutoMobile hondaAutoMobile =new HondaAutoMobile(9.00D, 7.00D);
		hondaAutoMobile.setBrand("TVS");
		hondaAutoMobile.setType("Four Wheller");
		
		hondaAutoMobile.torisu();
		System.out.println("*--------*");
		
		TataAutoMobile tataAutoMobile= new TataAutoMobile();
		tataAutoMobile.setBrand("TATA");
		tataAutoMobile.setType("Four Wheller");
		
		tataAutoMobile.torisu();
		
	}

}
