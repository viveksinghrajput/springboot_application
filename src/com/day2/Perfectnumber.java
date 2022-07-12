package com.day2;

import java.util.Scanner;

public class Perfectnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=1;
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if (sum==num)
		{
		System.out.println(num+"is a Perfect number");
		}
		else
		System.out.println(num+" is not a Perfect number");
	}

}
