package com.xworkz.testexam;

public class mainMethodRunner {

	public static void main(String[] args) {
		
		OmkarTrainer omkar=new OmkarTrainer("Founder X-workz Development Center MR.Omkar",12,"Software Developer");
		
		int work=omkar.getexperience();
		
		System.out.println(work);
		System.out.println(omkar.getName());
		System.out.println(omkar.getspecialzation());
		System.out.println(omkar.setTraining());
		System.out.println(omkar.setConductInterview());
		System.out.println(omkar.setCoding());
		
		
		OmkarTrainer omkar1=new OmkarTrainer("Founder X-workz Development Center MR.Omkar1",12,"Hibernate, Spring, Angular & Cloud");
		
		int work1=omkar1.getexperience();
		
		System.out.println(work1);
		System.out.println(omkar.getName());
		System.out.println(omkar.getspecialzation());
		System.out.println(omkar.setTraining());
		System.out.println(omkar.setConductInterview());
		System.out.println(omkar.setCoding());
		
		
		

	}

}
