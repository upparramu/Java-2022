package com.xworkz.programming;

import java.util.Scanner;

public class StringReverse {
	
	   public static String reverseString(String str){
		      if(str.isEmpty()){
		         return str;
		      }
		      
		      else{
		         return reverseString(str.substring(1))+str.charAt(0);
		      }
		   }
		   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a String :practice of lot a needs coding at good getting ");
		      String str = sc.next();
		      String result = StringReverse.reverseString(str);
		      System.out.println(result);
		   }
		}


