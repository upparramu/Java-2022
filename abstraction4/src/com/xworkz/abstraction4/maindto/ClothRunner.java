package com.xworkz.abstraction4.maindto;


import com.xworkz.abstraction4.dto.ClothDTO;

public class ClothRunner {

	public static void main(String[] args) {
	
			ClothDTO c = new ClothDTO();
			c.setColour("Orange");
			c.setType("Cotton");
			
			
			ClothDTO c2 = new ClothDTO();
			c2.setColour("Orange");
			c2.setType("Cotton");
			if (c.hashCode() == c2.hashCode())
			{
				c2.equals(c);
			}
			else
			{
				
				System.out.println("it is not equal");
			}

		}


	}


