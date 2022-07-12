package com.coding.test;

import java.util.Arrays;
import java.util.Collections;

/*
Java program to Find Largest and Smallest Number in an Array
*/
public class FindLargestSmallestNumber {
	public static void main(String[] args) {
		
		//array of 10 numbers
		int arr[] = new int[]{12,56,76,89,100,343,21,234};
		//1st way
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		//2nd way
		//assign first element of an array to largest and smallest
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largest);
		
	}

}
