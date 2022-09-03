package com.xworkz.abstraction3.main;


import com.xworkz.abstraction3.dto.BasketBallDTO;

public class BasketBallRunner {

	public static void main(String[] args) {
		
		BasketBallDTO ball = new BasketBallDTO();
		
		ball.setUmpire("Naresh");
		ball.setReferee("Sachin");
		
		BasketBallDTO ball2 = new BasketBallDTO();
		ball2.setUmpire("Basava");
		ball2.setReferee("Prashanth");
		if (ball.hashCode() == ball2.hashCode()) {
			ball2.equals(ball);
		}
		else {
			System.out.println("it is not equal");
		}

	
		
		
		
	
		

	}

	

}
