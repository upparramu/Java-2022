package com.xworkz.moviedatarunner;

import com.xworkz.moviedataDao.SpeakerDAO;
import com.xworkz.moviedataDto.SpeakerDTO;
import com.xworkz.moviedataimpl.SpeakerDAOimpl;

public class SpeakerRunner {

	public static void main(String[] args) {
		
		SpeakerDTO dto = new SpeakerDTO();
		
		dto.setBrandname("ORA");
		dto.setType("Head Phones");
		dto.setMagnet(true);
		dto.setGrapheneQ(true);
		dto.setBatterylast(22d);
		dto.setWireconnection(true);
		dto.setBluetoothconnection(true);
		dto.setHighresolution(true);
		
		String[] headphonesbuilt= {"MicroPhone"};
		dto.setHeadphonesbuilt(headphonesbuilt);
		
		dto.setHeadphonecost(39696d);
		
		String[] batterytype= {" LiPo battery"};
		dto.setBatterytype(batterytype);
		dto.setBluetoothversion(5);
		dto.setWarranty(90d);
		dto.setSoundquality(1d);
		dto.setPreferredprovider("Music Preferred");
		
		SpeakerDAO dao = new SpeakerDAOimpl();
		
		dao.create(dto);
		
		
		

	}

}
