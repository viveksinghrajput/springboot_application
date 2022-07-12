package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDSerialization {
	public static void main(String[] args) throws Exception{
		//serialization process
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		//De-Serialization process
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.x+":::::"+d1.y);
	}

}
