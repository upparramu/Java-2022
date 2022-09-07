package com.xworkz.interfaces2.school;

public class TeacherRule {

	private SchoolRule schoolRule;

	public TeacherRule(SchoolRule schoolRule) {
		System.out.println("-----Constructor of schoolRule-----");

		this.schoolRule = schoolRule;
	}

	public void school() {

		boolean dressCode = schoolRule.dressCode();
		int age = schoolRule.age();
		boolean idProof = schoolRule.idProof();

		if (dressCode && idProof && age > 18) {
			System.out.println("---Students is following the rules---");
		} else {
			System.out.println("---Students is not following the rule---");
		}
	}

}
