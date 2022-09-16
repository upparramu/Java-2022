package com.xworkz.checked.main;

import com.xworkz.checked.bridge.dao.TouristPlaceDAO;
import com.xworkz.checked.bridge.dao.impl.TouristPlaceDAOImpl;
import com.xworkz.checked.bridge.service.TouristPlaceService;
import com.xworkz.checked.bridge.service.impl.ToristPlaceServiceImpl;
import com.xworkz.checked.exception.InvalidPlaceNameException;

public class TouristPlaceRunner {

	public static void main(String[] args) {

		TouristPlaceDAO dao = new TouristPlaceDAOImpl();
		
		TouristPlaceService service = new ToristPlaceServiceImpl(dao);
		try {
		service.validateAndSave("Taj Mahal");
		service.validateAndSave("Hampi");

		}
		catch(InvalidPlaceNameException ipe) {
			
			System.err.println("Invalid");
		}
	}

}
