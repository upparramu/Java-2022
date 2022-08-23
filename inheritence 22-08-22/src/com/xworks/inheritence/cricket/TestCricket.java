package com.xworks.inheritence.cricket;

public class TestCricket extends Cricket{
	
	String groundType;
	String setGroundType(String groundType)
	{
		this.groundType=groundType;
		return groundType;
	}
	
	@Override
	double presentation(double price)
	{
		System.out.println("got price of"+price);
		return price;
	}
	@Override
	public void torisu()
	{
		super.torisu();
		System.out.println("Ground type is"+groundType);
	}
	

}
