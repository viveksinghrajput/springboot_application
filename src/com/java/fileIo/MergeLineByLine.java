package com.java.fileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeLineByLine {
	
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("MergeLineByLine.txt");
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br1=new BufferedReader(new FileReader("file2.txt"));
		String line=br.readLine();
		String line1=br1.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
			while(line1!=null) {
				pw.println(line1);
				line1=br1.readLine();
				break;
			}
		}
		br.close();
		br1.close();
		pw.flush();
	}

}
