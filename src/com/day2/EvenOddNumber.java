package com.day2;

import java.util.Scanner;

//Write a program to check given number is EVEN or ODD?
public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		if(n%2==0)
		System.out.println(n+" is even");
		else
		System.out.println(n+" is odd");
	}

}
