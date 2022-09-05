package com.xworkz.abstraction11.dto;

public class SoftDrinkDTO {
	
	private String drinkName;
	private String country;
	private Integer energy;
	private Double carbohydrate;
	private Double sugar;
	private Double addedSugar;
	private Double totalFat;
	private Double pritine;
	private Double sodium;
	private String mfgBy;
	private Integer mfgDate;
	private Integer expDate;
	private Long contactNo;
	private String email;
	private String color;
	private Double quantity;
	private Double price;
	private Integer introducedIn;
	private String website;

	public SoftDrinkDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 472094;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof SoftDrinkDTO) {
				System.out.println("obj is instance of SoftDrinkDTO");
				SoftDrinkDTO convo = (SoftDrinkDTO) obj;
				String convoDrinkName = convo.drinkName;
				Integer convoIntroducedIn = convo.introducedIn;
				if (drinkName.equals(convoDrinkName) && introducedIn.equals(convoIntroducedIn)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Double getSugar() {
		return sugar;
	}

	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}

	public Double getAddedSugar() {
		return addedSugar;
	}

	public void setAddedSugar(Double addedSugar) {
		this.addedSugar = addedSugar;
	}

	public Double getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Double totalFat) {
		this.totalFat = totalFat;
	}

	public Double getPritine() {
		return pritine;
	}

	public void setPritine(Double pritine) {
		this.pritine = pritine;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public String getMfgBy() {
		return mfgBy;
	}

	public void setMfgBy(String mfgBy) {
		this.mfgBy = mfgBy;
	}

	public Integer getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Integer mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Integer getExpDate() {
		return expDate;
	}

	public void setExpDate(Integer expDate) {
		this.expDate = expDate;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getIntroducedIn() {
		return introducedIn;
	}

	public void setIntroducedIn(Integer introducedIn) {
		this.introducedIn = introducedIn;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}


}
