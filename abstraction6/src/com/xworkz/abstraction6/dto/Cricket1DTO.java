package com.xworkz.abstraction6.dto;

public class Cricket1DTO {
	
	private String cricketTeam;
	private String state;
	private int noOfPlayersPlaying;
	private String captainName;
	private String viceCaptainName;
	private String stadiumName;
	private int NoOfUmpires;
	private String StadiumType;
	private int extraPlayers;
	private int iplTropiesWin;
	private int mostSixesInIpl;
	private int mostFoursInIpl;
	private int mostWicketInIpl;
	private int MostRunOutsInIpl;
	private String highestMetreSix;
	private String highestTotalScore;
	
	public Cricket1DTO()
	{
		System.out.println("Cricket1DTO is a default constructor");
	}

	public String getCricketTeam() {
		return cricketTeam;
	}

	public void setCricketTeam(String cricketTeam) {
		this.cricketTeam = cricketTeam;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNoOfPlayersPlaying() {
		return noOfPlayersPlaying;
	}

	public void setNoOfPlayersPlaying(int noOfPlayersPlaying) {
		this.noOfPlayersPlaying = noOfPlayersPlaying;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getViceCaptainName() {
		return viceCaptainName;
	}

	public void setViceCaptainName(String viceCaptainName) {
		this.viceCaptainName = viceCaptainName;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getNoOfUmpires() {
		return NoOfUmpires;
	}

	public void setNoOfUmpires(int noOfUmpires) {
		NoOfUmpires = noOfUmpires;
	}

	public String getStadiumType() {
		return StadiumType;
	}

	public void setStadiumType(String stadiumType) {
		StadiumType = stadiumType;
	}

	public int getExtraPlayers() {
		return extraPlayers;
	}

	public void setExtraPlayers(int extraPlayers) {
		this.extraPlayers = extraPlayers;
	}

	public int getIplTropiesWin() {
		return iplTropiesWin;
	}

	public void setIplTropiesWin(int iplTropiesWin) {
		this.iplTropiesWin = iplTropiesWin;
	}

	public int getMostSixesInIpl() {
		return mostSixesInIpl;
	}

	public void setMostSixesInIpl(int mostSixesInIpl) {
		this.mostSixesInIpl = mostSixesInIpl;
	}

	public int getMostFoursInIpl() {
		return mostFoursInIpl;
	}

	public void setMostFoursInIpl(int mostFoursInIpl) {
		this.mostFoursInIpl = mostFoursInIpl;
	}

	public int getMostWicketInIpl() {
		return mostWicketInIpl;
	}

	public void setMostWicketInIpl(int mostWicketInIpl) {
		this.mostWicketInIpl = mostWicketInIpl;
	}

	public int getMostRunOutsInIpl() {
		return MostRunOutsInIpl;
	}

	public void setMostRunOutsInIpl(int mostRunOutsInIpl) {
		MostRunOutsInIpl = mostRunOutsInIpl;
	}

	public String getHighestMetreSix() {
		return highestMetreSix;
	}

	public void setHighestMetreSix(String highestMetreSix) {
		this.highestMetreSix = highestMetreSix;
	}

	public String getHighestTotalScore() {
		return highestTotalScore;
	}

	public void setHighestTotalScore(String highestTotalScore) {
		this.highestTotalScore = highestTotalScore;
	}
	
	
	@Override
		
		public boolean equals(Object obj) {
			if(obj!=null)
			{
				System.out.println("Object is not a null");
			
			if(obj instanceof Cricket1DTO)
			{
				Cricket1DTO fb=(Cricket1DTO) obj;
				if(fb.captainName.equals(this.captainName) && fb.cricketTeam.equals(this.cricketTeam)) {
					System.out.println("both are same");
				}
				
				else {
					System.out.println("both are not same");
				}
							
				return super.equals(obj);
				}
			
			else {
				System.out.println("it is a null");
				
			}
		}
			return false;
	}
	
	
	
	
	

}
