package com.day2;

import java.util.Scanner;

//Write a program to Print 1 to N numbers
public class Printnums {
	public static void main(String[] args) {
		System.out.println("Enter the number to print the pattern");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 1; i <=num; i++) {
			System.out.println(i);
		}
	}
}
