package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.CasinoDAO;

public class CasinoDAOimpl implements CasinoDAO{
	
	private String[] datastore= new String[5];
	private int index = 0;
	
	@Override
	public Boolean save(String name) {
		System.out.println("casino saved,"+name +"into index"+this.index++);
		this.datastore[index]=name;
		return false;
	}
	

}
