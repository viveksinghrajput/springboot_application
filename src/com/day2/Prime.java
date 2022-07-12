package com.day2;

import java.util.Scanner;

//Write a program to check whether the given number is PRIME or not
public class Prime {
public static void main(String[] args) {
	System.out.println("Enter the number to check prime number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	boolean isPrimeNumber=true;
	if(num==0) {
		System.out.println(num+" is not prime");
	}
	for (int i = 2; i < num; i++) {
		if(num%i==0) {
			isPrimeNumber=false;
			System.out.println(num+" not a prime");
			break;
		}
	}
	if(isPrimeNumber)
	System.out.println(num+" is prime number");
}
}
