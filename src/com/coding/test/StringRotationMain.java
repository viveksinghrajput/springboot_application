package com.coding.test;

public class StringRotationMain {
	public static void main(String[] args) {
		System.out.println(
                "java2blog and blogjava2 are rotation of each other : " + isRotation("java2blog", "blogjava2"));
        System.out.println(
                "java2blog and avablog2j are rotation of each other : " + isRotation("java2blog", "avablog2j"));
 
	}

	private static boolean isRotation(String str, String rotationString) {
		String str2=str+str;
		if(str2.contains(rotationString)) {
			return true;
		}
		return false;
	}

}
