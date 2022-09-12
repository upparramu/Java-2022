package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.ApartmentsDAO;
import com.xworkz.moviedataDto.ApartmentsDTO;

public class ApartmentsDAOimpl implements ApartmentsDAO {

	private ApartmentsDTO[] room = new ApartmentsDTO[14];
	private int index = 0;
     
	@Override
	public Boolean create(ApartmentsDTO dto) {

		this.room[index] = dto;
		System.out.println("Apartment is saved" + dto + "into index" + this);
		this.index++;
		return true;

	}

}
