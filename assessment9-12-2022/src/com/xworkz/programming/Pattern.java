package com.xworkz.programming;

public class Pattern {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.println("* ");
			}
			for(int j=i; j<=n; j++) 
			{
				System.out.println("* ");
			}
			for(int j=1; j<n; j++) 
			{
				System.out.println("* ");
			}
			
			System.out.println();
		}
		
		for(int i=2;i<=n;i++) {
			
			for(int j=i; j<=n; j++) 
			{
				System.out.println("*  ");
			}
			for(int j=1; j<=i;j++) 
			{
				System.out.println("*  ");
			}
			for(int j=1; j<i; j++) 
			{
				System.out.println("*  ");
			}
			for(int j=i; j<n; j++) 
			{
				System.out.println("  ");
			}
			for(int j=i; j<n; j++) 
			{
				System.out.println("  ");
			}
			
			System.out.println();
		}

	}

}