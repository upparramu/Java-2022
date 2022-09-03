package com.xworkz.abstraction3.dto;

//import com.xworkz.abstraction2.Dto.FootBallDTO;

public class BasketBallDTO {
	
	private String captainName;
	private String teamName;
	private String coachName;
	private int noOfPlayers;
	private int noOfExtraPlayers;
	private String countryName;
	private String SponsersName;
	private String StadiumName;
	private String manOfTheMatch;
	private String manOfSeries;
	private String highestGoalsInTheMatch;
	private String highestGoalsInTheSeries;
	private String bestPlayerInTheWorld;
	private boolean defensiveLine;
	private int defensiveLineSize;
	private int defensiveLineStrength;
	private int defensiveLineSpeed;
	private boolean helmetProtectHead;
	private boolean wearPads;
	private String umpire;
	private String referee;
	private String ceoOfTeam;
	private String basketballInTournament;
	
	public BasketBallDTO()
	{
		System.out.println("BasketBallDTO is a default constructor");
	}

	public BasketBallDTO(String captainName, String teamName, String coachName, int noOfPlayers, int noOfExtraPlayers,
			String countryName, String sponsersName, String stadiumName, String manOfTheMatch, String manOfSeries,
			String highestGoalsInTheMatch, String highestGoalsInTheSeries,  String bestPlayerInTheWorld, boolean defensiveLine, int defensiveLineSize,
			int defensiveLineStrength, int defensiveLineSpeed, boolean helmetProtectHead, boolean wearPads,
			String umpire, String referee, String ceoOfTeam, String basketballInTournament) {
		this.captainName = captainName;
		this.teamName = teamName;
		this.coachName = coachName;
		this.noOfPlayers = noOfPlayers;
		this.noOfExtraPlayers = noOfExtraPlayers;
		this.countryName = countryName;
		this.SponsersName = sponsersName;
		this.StadiumName = stadiumName;
		this.manOfTheMatch = manOfTheMatch;
		this.manOfSeries = manOfSeries;
		this.highestGoalsInTheMatch = highestGoalsInTheMatch;
		this.highestGoalsInTheSeries = highestGoalsInTheSeries;
		this.bestPlayerInTheWorld = bestPlayerInTheWorld;
		this.defensiveLine = defensiveLine;
		this.defensiveLineSize = defensiveLineSize;
		this.defensiveLineStrength = defensiveLineStrength;
		this.defensiveLineSpeed = defensiveLineSpeed;
		this.helmetProtectHead = helmetProtectHead;
		this.wearPads = wearPads;
		this.umpire = umpire;
		this.referee = referee;
		this.ceoOfTeam = ceoOfTeam;
		this.basketballInTournament = basketballInTournament;
	}
	
	@Override
	public int hashCode() {
		return 501;
	}

	


	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getNoOfExtraPlayers() {
		return noOfExtraPlayers;
	}

	public void setNoOfExtraPlayers(int noOfExtraPlayers) {
		this.noOfExtraPlayers = noOfExtraPlayers;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getSponsersName() {
		return SponsersName;
	}

	public void setSponsersName(String sponsersName) {
		this.SponsersName = sponsersName;
	}

	public String getStadiumName() {
		return StadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.StadiumName = stadiumName;
	}

	public String getManOfTheMatch() {
		return manOfTheMatch;
	}

	public void setManOfTheMatch(String manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}

	public String getManOfSeries() {
		return manOfSeries;
	}

	public void setManOfSeries(String manOfSeries) {
		this.manOfSeries = manOfSeries;
	}

	public String getHighestGoalsInTheMatch() {
		return highestGoalsInTheMatch;
	}

	public void setHighestGoalsInTheMatch(String highestGoalsInTheMatch) {
		this.highestGoalsInTheMatch = highestGoalsInTheMatch;
	}

	public String getHighestGoalsInTheSeries() {
		return highestGoalsInTheSeries;
	}

	public void setHighestGoalsInTheSeries(String highestGoalsInTheSeries) {
		this.highestGoalsInTheSeries = highestGoalsInTheSeries;
	}

	public String getBestPlayerInTheWorld() {
		return bestPlayerInTheWorld;
	}

	public void setBestPlayerInTheWorld(String bestPlayerInTheWorld) {
		this.bestPlayerInTheWorld = bestPlayerInTheWorld;
	}

	public boolean isDefensiveLine() {
		return defensiveLine;
	}

	public void setDefensiveLine(boolean defensiveLine) {
		this.defensiveLine = defensiveLine;
	}

	public int getDefensiveLineSize() {
		return defensiveLineSize;
	}

	public void setDefensiveLineSize(int defensiveLineSize) {
		this.defensiveLineSize = defensiveLineSize;
	}

	public int getDefensiveLineStrength() {
		return defensiveLineStrength;
	}

	public void setDefensiveLineStrength(int defensiveLineStrength) {
		this.defensiveLineStrength = defensiveLineStrength;
	}

	public int getDefensiveLineSpeed() {
		return defensiveLineSpeed;
	}

	public void setDefensiveLineSpeed(int defensiveLineSpeed) {
		this.defensiveLineSpeed = defensiveLineSpeed;
	}

	public boolean isHelmetProtectHead() {
		return helmetProtectHead;
	}

	public void setHelmetProtectHead(boolean helmetProtectHead) {
		this.helmetProtectHead = helmetProtectHead;
	}

	public boolean isWearPads() {
		return wearPads;
	}

	public void setWearPads(boolean wearPads) {
		this.wearPads = wearPads;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getCeoOfTeam() {
		return ceoOfTeam;
	}

	public void setCeoOfTeam(String ceoOfTeam) {
		this.ceoOfTeam = ceoOfTeam;
	}

	public String getBasketballInTournament() {
		return basketballInTournament;
	}

	public void setBasketballInTournament(String basketballInTournament) {
		this.basketballInTournament = basketballInTournament;
	}
	
@Override
	
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("Object is not a null");
		
		if(obj instanceof BasketBallDTO)
		{
			BasketBallDTO fb=(BasketBallDTO) obj;
			if(fb.referee.equals(this.referee) && fb.umpire.equals(this.umpire)) {
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
