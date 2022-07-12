package com.day1;

public class CustomeExceptionTest{
	public static void main(String[] args) throws NullPointerExceptionCustome  {
		int num=10;	
		while(num!=0) {
			throw  new NullPointerExceptionCustome("Number can not be divisual by zero");
		}
		
	}

	

}
