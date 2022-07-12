package com.java.fileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileContainer {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("file//FileContainer.txt");
		File f=new File("C://Notes-Interview//JavaWorkSpace//Interview-Demo//file");
		String[] list=f.list();
		for (String file : list) {
			pw.println("********************************");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line=br.readLine();
			while(line!=null) {
				pw.println(line);
				line=br.readLine();
			}
		}
		pw.flush();
		pw.close();
	}

}
