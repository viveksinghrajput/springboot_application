package com.coding.test;

public class ReverseStringusingLoop {
	public static void main(String[] args) {
		String str = "java2blog";
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
        System.out.println("Reverse String = "+reverse);
        
        //using stringbuffer string
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reverse String using String buffer = "+sb.reverse());
	}

}
