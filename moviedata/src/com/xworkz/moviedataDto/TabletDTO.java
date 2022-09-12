package com.xworkz.moviedataDto;

import java.io.Serializable;
import java.util.Arrays;

public class TabletDTO implements Serializable{
	
	private String brandName;
	private Integer mg;
	private String otherName;
	private String drug;             
	private String tabletUsage;
	private String tabletAction;
	private Boolean safeToUse;
	private String[] tabletContains;
	private String[] sideEffects;
	private Double price;
	private String therapy;
	private Integer storedTemp;
	private String manufacture;
	private String medicineComposition;
	private Boolean solublityInWater;
	
	public TabletDTO() {
		System.out.println("---Default Constuctor---");
	}

	@Override
	public String toString() {
		return "TabletDTO [brandName=" + brandName + ", mg=" + mg + ", otherName=" + otherName + ", drug=" + drug
				+ ", tabletUsage=" + tabletUsage + ", tabletAction=" + tabletAction + ", safeToUse=" + safeToUse
				+ ", tabletContains=" + Arrays.toString(tabletContains) + ", sideEffects="
				+ Arrays.toString(sideEffects) + ", price=" + price + ", therapy=" + therapy + ", storedTemp="
				+ storedTemp + ", manufacture=" + manufacture + ", medicineComposition=" + medicineComposition
				+ ", solublityInWater=" + solublityInWater + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setMg(Integer mg) {
		this.mg = mg;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public void setDrug(String drug) {
		this.drug = drug;
	}

	public void setTabletUsage(String tabletUsage) {
		this.tabletUsage = tabletUsage;
	}

	public void setTabletAction(String tabletAction) {
		this.tabletAction = tabletAction;
	}

	public void setSafeToUse(Boolean safeToUse) {
		this.safeToUse = safeToUse;
	}

	public void setTabletContains(String[] tabletContains) {
		this.tabletContains = tabletContains;
	}

	public void setSideEffects(String[] sideEffects) {
		this.sideEffects = sideEffects;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}

	public void setStoredTemp(Integer storedTemp) {
		this.storedTemp = storedTemp;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public void setMedicineComposition(String medicineComposition) {
		this.medicineComposition = medicineComposition;
	}

	public void setSolublityInWater(Boolean solublityInWater) {
		this.solublityInWater = solublityInWater;
	}
	
	
}
