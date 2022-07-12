package com.day2;

import java.util.Scanner;
//Write a program to display PRIME NUMBERS from 1 to n?
public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find prime number ");
		int num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			boolean isPrime = true;
			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime)
				System.out.print(i + " ");
		}

	}
}
