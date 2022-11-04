package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.HospitalDto;

public interface HospitalService {
	
	boolean validateAndSave(HospitalDto dto);

}
