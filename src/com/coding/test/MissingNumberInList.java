package com.coding.test;

public class MissingNumberInList {
	public static void main(String[] args) {
		 int[] arr1={7,5,6,1,4,2};//op-3
	        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
	        int[] arr2={5,3,1,2};//op-4
	        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
	 
	}

	private static int missingNumber(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;//7*8/2;--7*4=28
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum=restSum+ arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
	}

}
