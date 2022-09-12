package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.AlocholDAO;
import com.xworkz.moviedataDto.AlcoholDTO;

public class AlocholDAOimpl implements AlocholDAO{
	
	private AlcoholDTO[] drug = new AlcoholDTO[14];
	private int index = 0;
      
	public Boolean create(AlcoholDTO dto) {

		this.drug[index] = dto;
		System.out.println("Alochol is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}

}
