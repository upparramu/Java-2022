package com.xworkz.abstraction5.maindto;


import com.xworkz.abstraction5.dto.PlantDTO;

public class PlantRunner {

	public static void main(String[] args) {
		PlantDTO p = new PlantDTO();
		p.setCommonName("Santhosh");
		p.setScientificName("Dyamanna");
		
		
		PlantDTO p2 = new PlantDTO();
		p2.setCommonName("Santhosh");
		p2.setScientificName("Dyamanna");
		if (p.hashCode() == p2.hashCode()) {
			p2.equals(p);
		}
		else {
			System.out.println("it is not equal");
		}

	}

}