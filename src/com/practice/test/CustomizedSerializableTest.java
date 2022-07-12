package com.practice.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Apple implements Serializable{
	String UserName="Vivek";
	transient String password="Incorrect@123";
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String Apassword = "123" + password;
		oos.writeObject(Apassword);
		
	}
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String epwd = (String) ois.readObject();
		password=epwd.substring(3);
	}
}


class CustomizedSerializableTest {
	
	public static void main(String[] args) throws Exception{
		
		Apple a=new Apple();
		System.out.println(a.UserName+"::"+a.password);
		//for serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		//for de- serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Apple a1=(Apple)ois.readObject();
		System.out.println(a1.UserName+"::"+a1.password);
		
	}

}
