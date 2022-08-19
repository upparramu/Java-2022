package com.xworks.inheritance.child;

import com.xworks.inheritance.parent.Planet;

public class Earth extends Planet {
	
	public int diameterForEarth;
	public String shapeOfEarth;
    public boolean waterInEarth;
    
    public Earth(int diameterForEarth, String shapeOfEarth, boolean waterInEarth)
    {
    	super ("dark blue",48,false);
    	
    	this.diameterForEarth=diameterForEarth;
    	this.shapeOfEarth=shapeOfEarth;
    	this.waterInEarth=waterInEarth;
    	super.color=color;
  	    super.distanceFromEarth=distanceFromEarth;
  	    super.waterInPlanet=waterInPlanet;
  	    System.out.println("Constructer of earth");
  	    
    }
  	    public void torisu()
  	    {
  	    
  	  System.out.println(this.diameterForEarth);
  	  System.out.println(this.shapeOfEarth);
  	  System.out.println(this.waterInEarth);
  	  System.out.println(super.color);
  	  System.out.println(super.waterInPlanet);
  	  System.out.println(super.distanceFromEarth);
  	    
    }
    
    
    
}
