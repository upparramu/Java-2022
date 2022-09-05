package com.xworkz.absttraction10.runner;

import com.xworkz.absttraction10.dto.SchoolDTO;

public class SchoolRunner {

	
		
		public static void main(String[] args) {

			SchoolDTO nems = new SchoolDTO();
			System.out.println(nems.hashCode());
			nems.setName("National E.M.High School");
			nems.setClassTeacher("Mounika");

			SchoolDTO nems2 = new SchoolDTO();
			System.out.println(nems2.hashCode());
			nems2.setName("National E.M.High School");
			nems2.setClassTeacher("Mounika");

			nems.equals(nems2);

		}
	}


