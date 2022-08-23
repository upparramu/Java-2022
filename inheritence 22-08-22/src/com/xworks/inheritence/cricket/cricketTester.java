package com.xworks.inheritence.cricket;

class cricketTester {

	public static void main(String[] args) {
		
		Cricket cricket=new Cricket();
		System.out.println("*--------------------------------*");
		cricket.setCountry("India");
		cricket.setCaptain("M.S.Dhoni");
		cricket.setGender("Male");
		cricket.entertainment();
		cricket.presentation(25845.2);
		cricket.torisu();
		
	    TestCricket tc=new TestCricket();
	    System.out.println("*--------------------*");
	    
	    tc.setCountry("India");
	    tc.setCaptain("M.S.Dhoni");
	    tc.setGender("Male");
	    tc.entertainment();
	    tc.presentation(8956254.1);
	    tc.setGroundType("Muddy");
	    tc.torisu();
	    
	    System.out.println("*---------------------*");
	    T20Cricket t20=new T20Cricket();
	    t20Cricket();
	    //t20.Cricket= null;
		t20.setCountry("India");
		t20.setCaptain("M.S.Dhoni");
		t20.setGender("Male");
		t20.manOfTheMatch("Dhoni");
		t20.torisu();
		
		
		
	    
	    
	    
	    
	}

	private static void t20Cricket() {
		// TODO Auto-generated method stub
		
	}

	
		
	}


