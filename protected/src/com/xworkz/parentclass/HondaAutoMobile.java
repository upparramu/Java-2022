package com.xworkz.parentclass;

public class HondaAutoMobile extends AutoMobile{
	
	public double openTime;
	public double closeTime;
	
	public HondaAutoMobile(double openTime, double closeTime) 
	{
		this.openTime=openTime;
		this.closeTime=closeTime;
	}

	@Override
	public  void torisu()
	{
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
}
