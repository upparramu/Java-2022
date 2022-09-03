package com.xworkz.abstraction8.runner;

import com.xworkz.abstraction8.dto.AvengersDTO;

public class AvengersRunner {
	
	public static void main(String[] args) {
		
		AvengersDTO av = new AvengersDTO();
				
		av.setaForceFilm(true);
		av.setLeaders("kyiara");
		av.setFormerMembers("Brue Smith");
		av.setIdentity("David");
		av.setAllies("Gruck");
		av.setEnemies("Jones");
		av.setOrigin("BBC");
		av.setReality("Hulk");
		av.setCreators("Joseph");
		av.setAvengersais(true);
		av.setAvengerAcademy(true);
		av.setAvengerMechanism(true);
		av.setAvengersWorld(true);
		av.setHulk(true);
		av.setGirlHulk(true);
		av.setAvengersEndGame(true);
		av.setAvengersinfinity(true);
		
		AvengersDTO av1 = new AvengersDTO();
		
		av1.setaForceFilm(true);
		av1.setLeaders("kyiara");
		av1.setFormerMembers("Brue Smith");
		av1.setIdentity("David");
		av1.setAllies("Gruck");
		av1.setEnemies("Jones");
		av1.setOrigin("BBC");
		av1.setReality("Hulk");
		av1.setCreators("Joseph");
		av1.setAvengersais(true);
		av1.setAvengerAcademy(true);
		av1.setAvengerMechanism(true);
		av1.setAvengersWorld(true);
		av1.setHulk(true);
		av1.setGirlHulk(true);
		av1.setAvengersEndGame(true);
		av1.setAvengersinfinity(true);
		
		av.equals(av1);
		
		
		
				
	}

}
