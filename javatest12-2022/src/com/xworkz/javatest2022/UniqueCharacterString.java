package com.xworkz.javatest2022;

import java.util.HashSet;

public class UniqueCharacterString {

	public static void main(String[] args) {
			
  System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
  System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));
		}
		 
		public static boolean hasAllUniqueChars (String word) {
		 
		     HashSet alphaSet=new HashSet();
		 
		     for(int index=0;index < word.length(); index ++)   {
		 
		         char c =word.charAt(index);
		 
		         
		         if(!alphaSet.add(c))
		      
		              return false;
		     }
		     
		     return true;
		}

}
