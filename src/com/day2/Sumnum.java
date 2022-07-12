package com.day2;

import java.util.Scanner;

//Write a program to display sum of 1 to N numbers?
public class Sumnum {
public static void main(String[] args) {
	System.out.println("Enter the number for Summation");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	for (int i = 1; i <= num; i++) {
		sum+=i;
	}
	System.out.println("Result "+sum);
}
}
