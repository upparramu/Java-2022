package com.xworkz.example;

import com.xworkz.example.implementor.LakeDAOImplementor;

public class LakeRunner {

	public static void main(String[] args) {

		LakeDAOImplementor daoImplementor = new LakeDAOImplementor();
		daoImplementor.save("||---BTM Lake---||");
		daoImplementor.save("||---Agara Lake---||");
		daoImplementor.save("||---Sarjapura Lake---||");
		daoImplementor.save("||---Hebbala Lake---||");
		daoImplementor.save("||---Ulsoor Lake---||");
		daoImplementor.save("||---Madiwala Lake---||");
		daoImplementor.printAllLakes();
	}

}
