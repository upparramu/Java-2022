package com.xworkz.moviedatarunner;

import com.xworkz.moviedataDao.AlocholDAO;
import com.xworkz.moviedataDto.AlcoholDTO;
import com.xworkz.moviedataimpl.AlocholDAOimpl;

public class AlocholRunner{

	public static void main(String[] args) {
		
		AlcoholDTO dto = new AlcoholDTO();
		dto.setPh(7.22);
		dto.setTaste("<<<  bitterness  >>>");
		dto.setNature("<<<  H2O  >>>");
		dto.setGroup("<<<  alcohol use disorder  >>>");
		dto.setBoilingPoint((double) 212);
		dto.setMeltingPoint((double) 97);
		dto.setDensity(49.2744);
		dto.setMolecularWeight(18.02);
		dto.setSolubilityInWater(true);
		dto.setNoOfCarbons(10);
		dto.setFlamable(true);
		dto.setToxicRange(0.03);
		dto.setVapourPressure((double) 290);
		dto.setConjugateAcid("<<  conjugate acid alkoxide  >>");
		dto.setConjugateBase("<<<  conjugate base  >>");
		
		AlocholDAO dao = new AlocholDAOimpl();
		dao.create(dto);
		
		

	}

	

}
