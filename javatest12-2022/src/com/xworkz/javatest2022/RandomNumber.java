package com.xworkz.javatest2022;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args)
	{
		int maxRange;

        //create objects and select random
		
        Scanner random = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=random.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
    }

}
