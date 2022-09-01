package com.xworkz.CricketDTO;



public class CricketRunner{

	public static void main(String[] args) {
		
		CricketDTO cricket = new CricketDTO("--Chennai Super Kings-- ", "TamilNadu", 11, "M.S.Dhoni", "Ravindra Jadeja", "Chinna Swamy Stadium", 2, "Grass", 9, 4);;
		System.out.println(cricket.getCricketTeam());
		System.out.println(cricket.getState());
		System.out.println(cricket.getNoOfPlayersPlaying());
		System.out.println(cricket.getCaptainName());
		System.out.println(cricket.getViceCaptainName());
		System.out.println(cricket.getStadiumName());
		System.out.println(cricket.getNoOfUmpires());
		System.out.println(cricket.getStadiumType());
		System.out.println(cricket.getExtraPlayers());
		System.out.println(cricket.getIplTropiesWin());
		
		
	
					
		
	}

}
