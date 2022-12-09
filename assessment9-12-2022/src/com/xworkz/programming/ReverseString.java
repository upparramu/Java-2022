package com.xworkz.programming;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String language="getting good at coding needs a lot of practise"; 
		
		StringBuffer string=new StringBuffer(language);

string=string.reverse();

if(language.equals(string.reverse())) {
	
	System.out.println("getting good at coding needs a lot of practise");	
}

else {
	
	System.out.println("practice of lot a needs coding at good getting");
}



}
	}


