package com.xworkz.checked.bridge.dao.impl;

import com.xworkz.checked.bridge.dao.TouristPlaceDAO;

public class TouristPlaceDAOImpl implements TouristPlaceDAO {

	private String[] store = new String[10];
	private int index= 0;
	@Override
	public boolean save(String placeName) {
		this.store[index] = placeName;
		System.out.println(placeName);
		this.index++;
		return false;
	}

	@Override
	public boolean check(String placeName) {
		for(String ref : store) {
			if(ref != null && ref.equals(placeName)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

}
