package com.xworkz.parentclass;

public class AutoMobile {
	
	public String type;
	public String brand;
	
	public double  sellAccessories(String name)
	{
		System.out.println("Executing sellAccessories"+name);
		if(name=="Shaft") {
			
		System.out.println("Shaft price is 7000");
			
		return 7000;
		}
		
		if(name=="Axles") {
		
		System.out.println("Axles price is 5000");
					
			return 5000;
		}
		if(name=="JointBase") {
			
		System.out.println("JointBase price is 2000");
			
			return 2000;
		}
		if(name=="ClutchCable") {
			
		System.out.println("ClutuchCable price is 1500");
			
			return 1500;
		}
	
		System.out.println("Accessories is not Matching");
			
		return 0;
	}
		
		protected void torisu()
		{
		System.out.println(this.type);
		System.out.println(this.brand);
		}
		
		public void setType(String type)
		{
			this.type=type;
		}
		public void setBrand(String brand)
		{
			this.brand=brand;
		}
		
	}


