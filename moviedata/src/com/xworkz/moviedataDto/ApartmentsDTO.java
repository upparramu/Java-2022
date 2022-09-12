package com.xworkz.moviedataDto;

import java.io.Serializable;

public class ApartmentsDTO implements Serializable{
	
	private String apartmentName;
	private String ownerName;
	private Double montlyIncome;
	private String location;
	private String state;
	private Double totalRooms;
	private Integer roomsAvailability;
	private Double roomCost;
	private Boolean luxuaryRooms;
	private Boolean hyigenic;
	private Boolean apartmentLease;
	private Integer staff;
	private Integer apartmentFloors;
	private Boolean parkingPlace;
	private Boolean roomsOnlyAvailabilityForFamilies;
	
	//Default Constructor
	
	public ApartmentsDTO() {
		System.out.println("--- Default Constructor ---");
	}
        
	      // Using toString 
	@Override
	public String toString() {
		return "ApartmentsDTO [apartmentName=" + apartmentName + ", ownerName=" + ownerName + ", montlyIncome="
				+ montlyIncome + ", location=" + location + ", state=" + state + ", totalRooms=" + totalRooms
				+ ", roomsAvailability=" + roomsAvailability + ", roomCost=" + roomCost + ", luxuaryRooms="
				+ luxuaryRooms + ", hyigenic=" + hyigenic + ", apartmentLease=" + apartmentLease + ", staff=" + staff
				+ ", apartmentFloors=" + apartmentFloors + ", parkingPlace=" + parkingPlace
				+ ", roomsOnlyAvailabilityForFamilies=" + roomsOnlyAvailabilityForFamilies + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
           
	    // Using Setters
	
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setMontlyIncome(Double montlyIncome) {
		this.montlyIncome = montlyIncome;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setTotalRooms(Double totalRooms) {
		this.totalRooms = totalRooms;
	}

	public void setRoomsAvailability(Integer roomsAvailability) {
		this.roomsAvailability = roomsAvailability;
	}

	public void setRoomCost(Double roomCost) {
		this.roomCost = roomCost;
	}

	public void setLuxuaryRooms(Boolean luxuaryRooms) {
		this.luxuaryRooms = luxuaryRooms;
	}

	public void setHyigenic(Boolean hyigenic) {
		this.hyigenic = hyigenic;
	}

	public void setApartmentLease(Boolean apartmentLease) {
		this.apartmentLease = apartmentLease;
	}

	public void setStaff(Integer staff) {
		this.staff = staff;
	}

	public void setApartmentFloors(Integer apartmentFloors) {
		this.apartmentFloors = apartmentFloors;
	}

	public void setParkingPlace(Boolean parkingPlace) {
		this.parkingPlace = parkingPlace;
	}

	public void setRoomsOnlyAvailabilityForFamilies(Boolean roomsOnlyAvailabilityForFamilies) {
		this.roomsOnlyAvailabilityForFamilies = roomsOnlyAvailabilityForFamilies;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public Double getMontlyIncome() {
		return montlyIncome;
	}

	public String getLocation() {
		return location;
	}

	public String getState() {
		return state;
	}

	public Double getTotalRooms() {
		return totalRooms;
	}

	public Integer getRoomsAvailability() {
		return roomsAvailability;
	}

	public Double getRoomCost() {
		return roomCost;
	}

	public Boolean getLuxuaryRooms() {
		return luxuaryRooms;
	}

	public Boolean getHyigenic() {
		return hyigenic;
	}

	public Boolean getApartmentLease() {
		return apartmentLease;
	}

	public Integer getStaff() {
		return staff;
	}

	public Integer getApartmentFloors() {
		return apartmentFloors;
	}

	public Boolean getParkingPlace() {
		return parkingPlace;
	}

	public Boolean getRoomsOnlyAvailabilityForFamilies() {
		return roomsOnlyAvailabilityForFamilies;
	}
	
	
	
	
	

}
