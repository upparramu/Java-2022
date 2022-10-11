package com.xworkz.automobile.main;

import java.util.List;
import java.util.ArrayList;

import com.xworkz.automobile.Dto.HouseDto;
import com.xworkz.automobile.enums.OwningType;
import com.xworkz.automobile.enums.Type;

public class HouseRunnerMain {

public static void main(String[] args) {
		
		HouseDto houseDTO1 = new HouseDto(1, "Chiguru", "Honey", Type.villa, 2, true, OwningType.own, 2500.0);
		HouseDto houseDTO2 = new HouseDto(17, "Doddamane", "Chandru", Type.appartment, 4, false, OwningType.lease, 3000.0);
		HouseDto houseDTO3 = new HouseDto(3, "Ganapa", "Suhas", Type.villa, 2, true, OwningType.rent, 2000.0);
		HouseDto houseDTO4 = new HouseDto(4, "Duniya Runa", "Dharshan", Type.individuial, 1, false, OwningType.rent, 1500.0);
		HouseDto houseDTO5 = new HouseDto(10, "Parimala nilaya", "Manoj", Type.individuial, 1, false, OwningType.rent, 1500.0);
		HouseDto houseDTO6 = new HouseDto(6, "Eshwarakrupa", "Malatesh", Type.villa, 2, true, OwningType.rent, 2550.0);
		HouseDto houseDTO7 = new HouseDto(7, "Adarsha", "Abhishek", Type.appartment, 5, false, OwningType.rent, 4500.0);
		HouseDto houseDTO8 = new HouseDto(8, "Aashirvada", "Basavaraj", Type.villa, 3, true, OwningType.rent, 2000.0);
		HouseDto houseDTO9 = new HouseDto(9, "Bhagya", "Sachin", Type.individuial, 1, true, OwningType.rent, 1200.0);
		HouseDto houseDTO10 = new HouseDto(5, "Bhavani", "Dada", Type.appartment, 8, false, OwningType.lease, 3600.0);
		HouseDto houseDTO11 = new HouseDto(11, "Chaya", "Dyamanna", Type.appartment, 15, false, OwningType.lease, 3150.0);
		HouseDto houseDTO12 = new HouseDto(12, "Daya", "Prajwal", Type.villa, 2, true, OwningType.own, 2300.0);
		HouseDto houseDTO13 = new HouseDto(13, "Kanasu", "Sunil", Type.villa, 3, true, OwningType.own, 2200.0);
		HouseDto houseDTO14 = new HouseDto(14, "Mamata", "Naresh", Type.appartment, 10, true, OwningType.own, 4000.0);
		HouseDto houseDTO15 = new HouseDto(15, "Nidhi", "Raghu", Type.individuial, 1, false, OwningType.own, 1310.0);
		HouseDto houseDTO16 = new HouseDto(16, "Shubh", "Santhosh", Type.individuial, 1, true, OwningType.lease, 1350.0);
		HouseDto houseDTO17 = new HouseDto(2, "Vishesha", "Parashuram", Type.individuial, 1, false, OwningType.rent, 1200.0);
		HouseDto houseDTO18 = new HouseDto(18, "Vismaya", "Sanjay", Type.appartment, 6, true, OwningType.own, 3100.0);
		HouseDto houseDTO19 = new HouseDto(19, "Ananda", "Sharath", Type.villa, 3, true, OwningType.own, 2020.0);
		HouseDto houseDTO20 = new HouseDto(20, "Ashraya", "Manohar", Type.appartment, 4, false, OwningType.rent, 3050.0);
		
		
		
		List<HouseDto> houseDTOs = new ArrayList<HouseDto>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO20);
		
		System.out.println("----------------------------asc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------asc by name----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by type----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getType().compareTo(e1.getType())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by sqft----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getSqft().compareTo(e1.getSqft())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------with loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == true)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------without loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == false)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------owning type by lease----------------------------------------");
		houseDTOs.stream().filter((e)->e.getOwningType() == OwningType.lease).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by appartment----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.appartment).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by villa----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.villa).forEach((e)->System.out.println(e));
		System.out.println("----------------------------order by type and asc by owningtype----------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
		int m=	r.getType().compareTo(r2.getType());
		if(m==0) {
		return	r.getOwningType().compareTo(r2.getOwningType());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
		System.out.println("--------------------------order by name and desc by id------------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
			int m=	r2.getName().compareTo(r.getName());
			if(m==0) {
			return	r2.getId().compareTo(r.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));




		
	}

}
