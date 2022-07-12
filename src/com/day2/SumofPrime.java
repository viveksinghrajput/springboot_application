
package com.day2;

import java.util.Scanner;

public class SumofPrime {
	public static void main(String[] args) {
		System.out.println("Enter the number for summing of prime number with in Range ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		for (int i = 1; i <=num; i++) {
			if(isPrimeNum(i)) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrimeNum(int num) {
		if(num==0) return false;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
