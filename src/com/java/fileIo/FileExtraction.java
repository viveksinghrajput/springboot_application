package com.java.fileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtraction {
	public static void main(String[] args)  throws IOException{
		PrintWriter pw=new PrintWriter("FileExtraction.txt");
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		String source=br.readLine();
		while(source!=null) {
			boolean available=false;
			BufferedReader br1=new BufferedReader(new FileReader("file2.txt"));
			String target=br1.readLine();
			while(target!=null){
				if(source.equals(target)) {
					available=true;
					break;
				}
				target=br1.readLine();
			}
			if(available==false) {
				pw.println(source);
			}
			source=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
