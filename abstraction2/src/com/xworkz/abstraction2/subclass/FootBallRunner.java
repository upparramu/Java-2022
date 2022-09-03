package com.xworkz.abstraction2.subclass;

import com.xworkz.abstraction2.Dto.FootBallDTO;

public class FootBallRunner {

	public static void main(String[] args) {
		FootBallDTO f = new FootBallDTO();
		f.setUmpire("Santhosh");
		f.setReferee("Dyamanna");
		
		
		FootBallDTO f1 = new FootBallDTO();
		f1.setUmpire("Santhosh");
		f1.setReferee("Dyamanna");
		if (f.hashCode() == f1.hashCode()) {
			f1.equals(f);
		}
		else {
			System.out.println("it is not equal");
		}

	}

}
	