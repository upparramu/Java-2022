package com.xworkz.checked.bridge.service;

import com.xworkz.checked.exception.InvalidPlaceNameException;

public interface TouristPlaceService {
	
	boolean validateAndSave(String placeName) throws InvalidPlaceNameException;

}
