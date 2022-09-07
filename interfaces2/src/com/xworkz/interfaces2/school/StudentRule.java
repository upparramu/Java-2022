package com.xworkz.interfaces2.school;

public class StudentRule implements SchoolRule {

	@Override
	public boolean dressCode() {
		System.out.println("--Student must and should wear the dresscode--");
		return true;
	}

	@Override
	public int age() {
		System.out.println("--If student want to applying the job must should have above 18years--");
		return 20;
	}

	@Override
	public boolean idProof() {
		System.out.println("--student must and should have schoolID Card--");
		return true;
	}

}
