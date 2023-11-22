package com.demo.beans;

import java.util.Scanner;

public class Prime {

	
	
	public static void findPrime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check p or n :");
		int num = sc.nextInt();
		boolean flag=false;
		
		for(int i =2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}
}
