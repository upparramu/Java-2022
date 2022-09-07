package com.xworkz.interfaces2.school;

public class SchoolRuleRunner {

	public static void main(String[] args) {
     
		SchoolRule schoolRule = new StudentRule();
		
		TeacherRule teacherRule = new TeacherRule(schoolRule);
		
		
		teacherRule.school();
	
		
	}

}
