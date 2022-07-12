package com.java.fileIo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("input.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		//Write code to create a directory named with SaiCharan123 in current 
		//working directory and create a file named with abc.txt in that directory.
		File f1=new File("SaiCharan123");
		f1.mkdir();
		File f2=new File("SaiCharan123", "abc.txt");
		f2.createNewFile();
		System.out.println(f2.getAbsolutePath());
		
		//Write a program to display the names of all files and directories present //c://SaiCharan123
		int count =0;
		File f12=new File("C:\\Notes-Interview\\JavaWorkSpace\\Interview-Demo\\SaiCharan123");
		String[] str=f12.list();
		for (String string : str) {
			count++;
			System.out.println(string);
		}
		System.out.println("total number : "+count);
	}

}
