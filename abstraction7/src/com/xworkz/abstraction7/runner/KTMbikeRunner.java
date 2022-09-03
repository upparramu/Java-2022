package com.xworkz.abstraction7.runner;

import com.xworkz.abstraction7.dto.KTMBikeDTO;

public class KTMbikeRunner {

	public static void main(String[] args) {
	
		KTMBikeDTO ktm = new KTMBikeDTO();
				
		ktm.setExhaustStreet(2);
		ktm.setBrakeDiscs(2);
		ktm.setSpecialParts(4);
		ktm.setEngineName("Four Stroke");
		ktm.setEngines(1);
		ktm.setStands(2);
		ktm.setRearBag(true);
		ktm.setSocket(true);
		ktm.setHandGuard(2);
		ktm.setGearShift(true);
		ktm.setSmartPhoneCase(true);
		ktm.setCrashBung("crash");
		ktm.setClutchCoverPreotection(true);
		ktm.setFuelTank(30);
		ktm.setSupportAdapter(2);
		ktm.setMoutainPin(2);
		
		KTMBikeDTO ktm2 = new KTMBikeDTO();
		
		ktm2.setExhaustStreet(1);
		ktm2.setBrakeDiscs(2);
		ktm2.setSpecialParts(3);
		ktm2.setEngineName("Two Stroke");
		ktm2.setEngines(8);
		ktm2.setStands(2);
		ktm2.setRearBag(true);
		ktm2.setSocket(true);
		ktm2.setHandGuard(2);
		ktm2.setGearShift(false);
		ktm2.setSmartPhoneCase(false);
		ktm2.setCrashBung("crash");
		ktm2.setClutchCoverPreotection(true);
		ktm2.setFuelTank(30);
		ktm2.setSupportAdapter(2);
		ktm2.setMoutainPin(2);
		
		ktm.equals(ktm2);
		
		
		
				
	}

}




