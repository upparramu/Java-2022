package com.xworkz.methods;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish= new Fish("Scad Fish","Salt Water");
		String ocean= fish.toString() ;   // method of toString()
		System.out.println("ocean");
		System.out.println(fish.getbreed());
		System.out.println(fish.gettype());
		
		

		Fish fish2=new Fish("Lion Fish","Salt Water");
		String ocean2=fish2.toString(); 
		System.out.println("ocean2");
		System.out.println(fish2.getbreed());
		System.out.println(fish2.gettype());

	}

}
