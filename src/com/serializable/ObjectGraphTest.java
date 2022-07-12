package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphTest {
	public static void main(String[] args) throws Exception {
		vivek viv=new vivek();
		FileOutputStream fos=new FileOutputStream("input.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(viv);
		
		FileInputStream fis=new FileInputStream("input.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		vivek viv1=(vivek) ois.readObject();
		
		System.out.println(viv1.jyoti.anshu.age);
	}

}
