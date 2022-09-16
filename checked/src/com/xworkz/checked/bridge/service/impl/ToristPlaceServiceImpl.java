package com.xworkz.checked.bridge.service.impl;

import com.xworkz.checked.bridge.dao.TouristPlaceDAO;
import com.xworkz.checked.bridge.service.TouristPlaceService;
import com.xworkz.checked.exception.InvalidPlaceNameException;

public class ToristPlaceServiceImpl implements TouristPlaceService {

	private TouristPlaceDAO dao;
	public ToristPlaceServiceImpl(TouristPlaceDAO dao) {
		this.dao=dao;
	}
	@Override
	public boolean validateAndSave(String placeName) throws InvalidPlaceNameException {
		if(placeName != null && placeName.length()>3 && placeName.length()<50) {
			if(this.dao.check(placeName)) {
				System.out.println("place is already there");
				throw new InvalidPlaceNameException("place is already there");
			}else {
				System.out.println("place is not exist");
				this.dao.save(placeName);
			}
		}else {
			throw new InvalidPlaceNameException("Invalid Name");
		}
		return false;
	}

}
