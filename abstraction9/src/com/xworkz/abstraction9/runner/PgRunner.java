package com.xworkz.abstraction9.runner;

import com.xworkz.abstraction9.dto.PgDTO;

public class PgRunner {

	public static void main(String[] args) {
		
		
		PgDTO pg = new PgDTO();
		System.out.println(pg.hashCode());
		pg.setPgname("Sri Balaji Gents PG");
		pg.setArea("HSR Layout");

		PgDTO pg1 = new PgDTO();
		System.out.println(pg1.hashCode());
		pg1.setPgname("Sri Balaji Gents PG");
		pg1.setArea("HSR Layout");

		pg.equals(pg1);
	}

	}


