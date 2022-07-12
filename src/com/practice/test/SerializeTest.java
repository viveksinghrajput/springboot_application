package com.practice.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest implements Serializable{
	int x=10;
	transient final int y=20;
	
	public static void main(String[] args) throws Exception {
		SerializeTest st=new SerializeTest();
		System.out.println(st.x+"::"+st.y);
		//for serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(st);
		//for Non serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SerializeTest s=(SerializeTest)ois.readObject();
		System.out.println(s.x+"::"+s.y);
	}
}
