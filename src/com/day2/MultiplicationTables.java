package com.day2;

import java.util.Scanner;

public class MultiplicationTables {
	public static void main(String[] args) {
		System.out.println("Enter the multiplication table number ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+" = "+i*j+"\t");
				
			}
			System.out.println();
		}
	}
}
