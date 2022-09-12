package com.xworkz.moviedataDto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {
	
	private Integer id;
	private String heroname;
	private String heroinename;
	private Double wwcollections;
	private String shootinglocations;
	private String[] producersname;
	private String[] actors;
	private Float reviews;
	private Double yearofrelease;
	private String directorname;
	private Double heroshare;
	private Double heroineshare;
	private String negativerolename;
	private Boolean availableinott;
	private Boolean blockbuster;
	
	public MovieDTO() {
		System.out.println("<<<---Default Constructor--->>>");
		
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", heroname=" + heroname + ", heroinename=" + heroinename + ", wwcollections="
				+ wwcollections + ", shootinglocations=" + shootinglocations + ", producersname="
				+ Arrays.toString(producersname) + ", actors=" + Arrays.toString(actors) + ", reviews=" + reviews
				+ ", yearofrelease=" + yearofrelease + ", directorname=" + directorname + ", heroshare=" + heroshare
				+ ", heroineshare=" + heroineshare + ", negativerolename=" + negativerolename + ", availableinott="
				+ availableinott + ", blockbuster=" + blockbuster + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeroname() {
		return heroname;
	}

	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}

	public String getHeroinename() {
		return heroinename;
	}

	public void setHeroinename(String heroinename) {
		this.heroinename = heroinename;
	}

	public double getWwcollections() {
		return wwcollections;
	}

	public void setWwcollections(double wwcollections) {
		this.wwcollections = wwcollections;
	}

	public String getShootinglocations() {
		return shootinglocations;
	}

	public void setShootinglocations(String shootinglocations) {
		this.shootinglocations = shootinglocations;
	}

	public String[] getProducersname() {
		return producersname;
	}

	public void setProducersname(String[] producersname) {
		this.producersname = producersname;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public float getReviews() {
		return reviews;
	}

	public void setReviews(float reviews) {
		this.reviews = reviews;
	}

	public double getYearofrelease() {
		return yearofrelease;
	}

	public void setYearofrelease(double yearofrelease) {
		this.yearofrelease = yearofrelease;
	}

	public String getDirectorname() {
		return directorname;
	}

	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}

	public double getHeroshare() {
		return heroshare;
	}

	public void setHeroshare(double heroshare) {
		this.heroshare = heroshare;
	}

	public double getHeroineshare() {
		return heroineshare;
	}

	public void setHeroineshare(double heroineshare) {
		this.heroineshare = heroineshare;
	}

	public String getNegativerolename() {
		return negativerolename;
	}

	public void setNegativerolename(String negativerolename) {
		this.negativerolename = negativerolename;
	}

	public boolean isAvailableinott() {
		return availableinott;
	}

	public void setAvailableinott(boolean availableinott) {
		this.availableinott = availableinott;
	}

	public boolean isBlockbuster() {
		return blockbuster;
	}

	public void setBlockbuster(boolean blockbuster) {
		this.blockbuster = blockbuster;
	}

	
	
	
	
	

}
