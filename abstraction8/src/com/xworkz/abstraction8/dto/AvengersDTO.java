package com.xworkz.abstraction8.dto;

public class AvengersDTO {
	
	private Boolean aForceFilm;
	private String leaders;
	private String formerMembers;
	private String identity;
	private String allies;
	private String enemies;
	private String origin;
	private String reality;
	private String creators;
	private Boolean avengersais;
	private Boolean avengerAcademy;
	private Boolean avengerMechanism;
	private Boolean avengersWorld;
	private Boolean hulk;
	private Boolean girlHulk;
	private Boolean avengersEndGame;
	private Boolean avengersinfinity;
	
	
	public AvengersDTO() {
		super();
	}


	public AvengersDTO(Boolean aForceFilm, String leaders, String formerMembers, String identity, String allies,
			String enemies, String origin, String reality, String creators, Boolean avengersais, Boolean avengerAcademy,
			Boolean avengerMechanism, Boolean avengersWorld, Boolean hulk, Boolean girlHulk, Boolean avengersEndGame,
			Boolean avengersinfinity) {
		this.aForceFilm = aForceFilm;
		this.leaders = leaders;
		this.formerMembers = formerMembers;
		this.identity = identity;
		this.allies = allies;
		this.enemies = enemies;
		this.origin = origin;
		this.reality = reality;
		this.creators = creators;
		this.avengersais = avengersais;
		this.avengerAcademy = avengerAcademy;
		this.avengerMechanism = avengerMechanism;
		this.avengersWorld = avengersWorld;
		this.hulk = hulk;
		this.girlHulk = girlHulk;
		this.avengersEndGame = avengersEndGame;
		this.avengersinfinity = avengersinfinity;
	}


	public Boolean getaForceFilm() {
		return aForceFilm;
	}


	public void setaForceFilm(Boolean aForceFilm) {
		this.aForceFilm = aForceFilm;
	}


	public String getLeaders() {
		return leaders;
	}


	public void setLeaders(String leaders) {
		this.leaders = leaders;
	}


	public String getFormerMembers() {
		return formerMembers;
	}


	public void setFormerMembers(String formerMembers) {
		this.formerMembers = formerMembers;
	}


	public String getIdentity() {
		return identity;
	}


	public void setIdentity(String identity) {
		this.identity = identity;
	}


	public String getAllies() {
		return allies;
	}


	public void setAllies(String allies) {
		this.allies = allies;
	}


	public String getEnemies() {
		return enemies;
	}


	public void setEnemies(String enemies) {
		this.enemies = enemies;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getReality() {
		return reality;
	}


	public void setReality(String reality) {
		this.reality = reality;
	}


	public String getCreators() {
		return creators;
	}


	public void setCreators(String creators) {
		this.creators = creators;
	}


	public Boolean getAvengersais() {
		return avengersais;
	}


	public void setAvengersais(Boolean avengersais) {
		this.avengersais = avengersais;
	}


	public Boolean getAvengerAcademy() {
		return avengerAcademy;
	}


	public void setAvengerAcademy(Boolean avengerAcademy) {
		this.avengerAcademy = avengerAcademy;
	}


	public Boolean getAvengerMechanism() {
		return avengerMechanism;
	}


	public void setAvengerMechanism(Boolean avengerMechanism) {
		this.avengerMechanism = avengerMechanism;
	}


	public Boolean getAvengersWorld() {
		return avengersWorld;
	}


	public void setAvengersWorld(Boolean avengersWorld) {
		this.avengersWorld = avengersWorld;
	}


	public Boolean getHulk() {
		return hulk;
	}


	public void setHulk(Boolean hulk) {
		this.hulk = hulk;
	}


	public Boolean getGirlHulk() {
		return girlHulk;
	}


	public void setGirlHulk(Boolean girlHulk) {
		this.girlHulk = girlHulk;
	}


	public Boolean getAvengersEndGame() {
		return avengersEndGame;
	}


	public void setAvengersEndGame(Boolean avengersEndGame) {
		this.avengersEndGame = avengersEndGame;
	}


	public Boolean getAvengersinfinity() {
		return avengersinfinity;
	}


	public void setAvengersinfinity(Boolean avengersinfinity) {
		this.avengersinfinity = avengersinfinity;
	}
	
	@Override
	public int hashCode() {
		return 504;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("Object is not a null");
		
		if(obj instanceof AvengersDTO)
		{
			AvengersDTO casted=(AvengersDTO) obj;
			if(casted.aForceFilm.equals(this.aForceFilm) &&casted.leaders.equals(this.leaders)&&casted.formerMembers.equals(this.formerMembers)
					&&casted.identity.equals(this.identity)
					&&casted.allies.equals(this.allies)
					&&casted.enemies.equals(this.enemies)
					&&casted.enemies.equals(this.enemies)
					&&casted.reality.equals(this.reality)
					&&casted.creators.equals(this.creators)
					&&casted.avengersais.equals(this.avengersais)
					&&casted.avengerAcademy.equals(this.avengerAcademy)
					&&casted.avengerMechanism.equals(this.avengerMechanism)
					&&casted.avengersWorld.equals(this.avengersWorld)
					&&casted.hulk.equals(this.hulk)&&casted.girlHulk.equals(this.girlHulk)
					&&casted.avengersEndGame.equals(this.avengersEndGame)
					&&casted.avengersEndGame.equals(this.avengersEndGame)) {
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
