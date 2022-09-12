package com.xworkz.moviedatarunner;

import com.xworkz.moviedataDao.TabletDAO;
import com.xworkz.moviedataDto.TabletDTO;
import com.xworkz.moviedataimpl.TabletDAOimpl;

public class TabletRunner {

	public static void main(String[] args) {
		
		TabletDTO dto = new TabletDTO();
		
		dto.setBrandName("<<<  Dolo  >>>");
		dto.setMg(650);
		dto.setOtherName("<<<  Acetaminophen  >>>");
		dto.setDrug("<<<  NSAIDs  >>>");
		dto.setTabletUsage("<<<  Headache  >>>");
		dto.setTabletAction("<<< Relieve Pain  >>>");
		dto.setSafeToUse(true);
		
		String[] tabletContains= {"<<< 650MG Of Paracetamol >>>"};
		dto.setTabletContains(tabletContains);
		
		String[] sideEffects= {"<<<  Weakness  >>"};
		dto.setSideEffects(sideEffects);
		
		dto.setPrice(15d);
		dto.setTherapy("<<< Fixed Dose Combination  >>>");
		dto.setStoredTemp(100);
		dto.setManufacture("<<< Federation Of Medical  >>>");
		dto.setMedicineComposition("Dolo 650");
		dto.setSolublityInWater(true);
		
		TabletDAO dao = new TabletDAOimpl();
		
		dao.create(dto);

	}

}
