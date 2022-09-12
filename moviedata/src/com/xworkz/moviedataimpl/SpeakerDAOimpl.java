package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.SpeakerDAO;
import com.xworkz.moviedataDto.SpeakerDTO;

public class SpeakerDAOimpl implements SpeakerDAO {
	
	private SpeakerDTO[] speaker = new SpeakerDTO[14];
	private int index=0;
	
	public Boolean create(SpeakerDTO dto) {
		this.speaker[index] = dto;
		System.out.println("Speaker is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}
	
	
			
	
	

}
