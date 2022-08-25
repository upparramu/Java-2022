package com.xworkz.testexam;

public class Palindrome {

	public static void main(String[] args) {
		
		String language="Malayalam"; 
				
				StringBuffer name=new StringBuffer(language);
		
		name=name.reverse();
		
		if(language.equals(name.reverse())) {
			
			System.out.println("This is Palindrome");	
		}
		
		else {
			
			System.out.println("This is not palindrome");
		}
		
		

	}

}
