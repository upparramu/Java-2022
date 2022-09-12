package com.xworkz.moviedataDto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable{
	
	private Double ph;
	private Double boilingPoint;
	private Double meltingPoint;
	private Double density;
	private String taste;
	private String nature;
	private String group;
	private Double molecularWeight;
	private Boolean solubilityInWater;
	private Integer noOfCarbons;
	private Boolean flamable;
	private Double toxicRange;
	private Double vapourPressure;
	private String conjugateAcid;
	private String conjugateBase;
	
	public AlcoholDTO() {
	System.out.println("--- Default Constructor ---");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [ph=" + ph + ", boilingPoint=" + boilingPoint + ", meltingPoint=" + meltingPoint
				+ ", density=" + density + ", taste=" + taste + ", nature=" + nature + ", group=" + group
				+ ", molecularWeight=" + molecularWeight + ", solubilityInWater=" + solubilityInWater + ", noOfCarbons="
				+ noOfCarbons + ", flamable=" + flamable + ", toxicRange=" + toxicRange + ", vapourPressure="
				+ vapourPressure + ", conjugateAcid=" + conjugateAcid + ", conjugateBase=" + conjugateBase
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Double getPh() {
		return ph;
	}

	public void setPh(Double ph) {
		this.ph = ph;
	}

	public Double getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(Double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public Double getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(Double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Double getMolecularWeight() {
		return molecularWeight;
	}

	public void setMolecularWeight(Double molecularWeight) {
		this.molecularWeight = molecularWeight;
	}

	public Boolean getSolubilityInWater() {
		return solubilityInWater;
	}

	public void setSolubilityInWater(Boolean solubilityInWater) {
		this.solubilityInWater = solubilityInWater;
	}

	public Integer getNoOfCarbons() {
		return noOfCarbons;
	}

	public void setNoOfCarbons(Integer noOfCarbons) {
		this.noOfCarbons = noOfCarbons;
	}

	public Boolean getFlamable() {
		return flamable;
	}

	public void setFlamable(Boolean flamable) {
		this.flamable = flamable;
	}

	public Double getToxicRange() {
		return toxicRange;
	}

	public void setToxicRange(Double toxicRange) {
		this.toxicRange = toxicRange;
	}

	public Double getVapourPressure() {
		return vapourPressure;
	}

	public void setVapourPressure(Double vapourPressure) {
		this.vapourPressure = vapourPressure;
	}

	public String getConjugateAcid() {
		return conjugateAcid;
	}

	public void setConjugateAcid(String conjugateAcid) {
		this.conjugateAcid = conjugateAcid;
	}

	public String getConjugateBase() {
		return conjugateBase;
	}

	public void setConjugateBase(String conjugateBase) {
		this.conjugateBase = conjugateBase;
	}
	
	
	
	

}
