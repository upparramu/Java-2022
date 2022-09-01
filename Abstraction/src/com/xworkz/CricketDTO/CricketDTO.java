package com.xworkz.CricketDTO;

public  class CricketDTO {
	
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
	
	public CricketDTO()
	{
		System.out.println("*-----Default Constructor-----*");
	}
	
	public CricketDTO(String cricketTeam, String state, int noOfPlayersPlaying, String captainName,
			String viceCaptainName, String stadiumName, int noOfUmpires, String stadiumType, int extraPlayers,
			int iplTropiesWin) {
		this.cricketTeam = cricketTeam;
		this.state = state;
		this.noOfPlayersPlaying = noOfPlayersPlaying;
		this.captainName = captainName;
		this.viceCaptainName = viceCaptainName;
		this.stadiumName = stadiumName;
		this.NoOfUmpires = noOfUmpires;
		this.StadiumType = stadiumType;
		this.extraPlayers = extraPlayers;
		this.iplTropiesWin = iplTropiesWin;
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

	@Override
	public String toString() {
		return "CricketDTO [cricketTeam=" + cricketTeam + ", state=" + state + ", noOfPlayersPlaying="
				+ noOfPlayersPlaying + ", captainName=" + captainName + ", viceCaptainName=" + viceCaptainName
				+ ", stadiumName=" + stadiumName + ", NoOfUmpires=" + NoOfUmpires + ", StadiumType=" + StadiumType
				+ ", extraPlayers=" + extraPlayers + ", iplTropiesWin=" + iplTropiesWin + "]";
	}
	
	
	

	

	
	
	

   


	
	
	
	

}
