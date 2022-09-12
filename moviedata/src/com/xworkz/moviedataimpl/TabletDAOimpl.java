package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.TabletDAO;
import com.xworkz.moviedataDto.SpeakerDTO;
import com.xworkz.moviedataDto.TabletDTO;

public class TabletDAOimpl implements TabletDAO{

 private TabletDTO[] tablet = new TabletDTO[14];
 private int index=0;
 
 public Boolean create(TabletDTO dto) {
		this.tablet[index] = dto;
		System.out.println("Speaker is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}
 
	

}
