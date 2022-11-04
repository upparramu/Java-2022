package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.HospitalDto;
import com.xworkz.jdbc.repository.HospitalRepository;
import com.xworkz.jdbc.repository.HospitalRepositoryImp;

public class HospitalServiceImp implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDto dto) {
	System.out.println("Validation check will started");
	int id=dto.getId();
	String name=dto.getName();
	String founder=dto.getFounder();
	String specalist=dto.getSpecalist();
	int since=dto.getSince();
	
	if (id > 0 && id < 5000) {
		System.out.println("Hospital id is valid");
		if (name != null && name.length() > 5 && name.length() < 50) {
			System.out.println("Hospital name is valid");
			if (founder != null && founder.length() > 3 && founder.length() < 30) {
				System.out.println("Founder is valid");
				if (specalist != null && specalist.length() > 3 && specalist.length() < 30) {
					System.out.println("Hospital Specialist is valid");
					if (since > 1800 && since < 2023) {
						System.out.println("Hospital since is valid");
						HospitalRepository hr = new HospitalRepositoryImp();
						hr.save(dto);
					} 
				} else {
					System.err.println("Specialist is valid");
				}
			} else {
				System.err.println("Founder is inValid");
			}
		} else {
			System.out.println("Name is inValid");
		}
	} else {
		System.err.println("ID is Invalid");
	}
	
		
	
		return false;
	}

}
