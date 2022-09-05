package com.xworkz.abstraction11.runner;

import com.xworkz.abstraction11.dto.SoftDrinkDTO;

public class SoftDrinkRunner {

	public static void main(String[] args) {
		
		SoftDrinkDTO drink = new SoftDrinkDTO();
		drink.setDrinkName("Sprite");
		drink.setIntroducedIn(1976);
		
		SoftDrinkDTO drink2 = new SoftDrinkDTO();
		drink2.setDrinkName("Sprite");
		drink2.setIntroducedIn(1976);
		
		drink.equals(drink2);

	}

}
