package com.xworkz.parentclass;

public class TataAutoMobile extends AutoMobile {
	
	public TataAutoMobile() 
	{
		super();
		System.out.println("Tata is Default constructor");	
	}
	
	@Override
	public void torisu()
	{
		super.torisu();
		System.out.println(this.type);
		System.out.println(this.brand);
	}

}
