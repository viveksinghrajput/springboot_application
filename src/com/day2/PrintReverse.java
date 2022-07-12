package com.day2;

import java.util.Scanner;

//Write a program to Print REVERSE of N to 1 numbers?
public class PrintReverse {
	public static void main(String[] args) {
		System.out.println("Enter the number to print in reverse order");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}
	}

}
