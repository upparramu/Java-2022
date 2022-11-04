package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor


public class HospitalDto {
	
	private int id;//>0 && <50000
	private String name;//not null and no special Characters, >5 , <50
	private String specalist;//not null and no special Characters, >3 , <50
	private String founder;//not null and no special Characters, >5 , <50
	private int since;// >1800, <2022

	

	}

	
	
	
	
	


