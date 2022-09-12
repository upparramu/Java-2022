package com.xworkz.moviedatarunner;


import com.xworkz.moviedataDao.ApartmentsDAO;
import com.xworkz.moviedataDto.ApartmentsDTO;

import com.xworkz.moviedataimpl.ApartmentsDAOimpl;


public class ApartmentsRunner {
	
	public static void main(String[] args) {
	
	ApartmentsDTO dto = new ApartmentsDTO();
	
		dto.setApartmentName("<<<  CPWD Quaters  >>>");
		dto.setOwnerName("<<<  Shri Vinit Kumar Jayaswal  >>>");
		dto.setMontlyIncome(8d);
		dto.setLocation("<<<  HSR Layout  >>>");
		dto.setState("<<<  Karnataka  >>>");
		dto.setTotalRooms(1200d);
		dto.setRoomsAvailability(800);
		dto.setRoomCost(20d);
		dto.setLuxuaryRooms(true);
		dto.setHyigenic(true);
		dto.setApartmentLease(false);
		dto.setStaff(38);
		dto.setApartmentFloors(14);
		dto.setParkingPlace(true);
		dto.setRoomsOnlyAvailabilityForFamilies(true);
		
		ApartmentsDAO dao = new ApartmentsDAOimpl();
				dao.create(dto);
		
	
	 
	}


}
