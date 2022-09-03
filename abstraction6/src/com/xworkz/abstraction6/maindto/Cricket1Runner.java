package com.xworkz.abstraction6.maindto;


import com.xworkz.abstraction6.dto.Cricket1DTO;

public class Cricket1Runner {


	public static void main(String[] args) {
		
		Cricket1DTO cricket = new Cricket1DTO();
		
		cricket.setCaptainName("M.S.Dhoni");
		cricket.setCricketTeam("Chennai Super Kings");
		
		Cricket1DTO cricket2 = new Cricket1DTO();
		cricket2.setCaptainName("Rohit");
		cricket2.setCricketTeam("Mumbai Indians");
		if (cricket.hashCode() == cricket2.hashCode()) {
			cricket2.equals(cricket);
		}
		else {
			System.out.println("it is not equal");
		}

	
		
		
		
	
		

	}

	

}
