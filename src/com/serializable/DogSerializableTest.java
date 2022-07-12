package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DogSerializableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		//for serialize java object
		FileOutputStream fos=new FileOutputStream("vivek.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		//for deserialize file object to java 
		FileInputStream fis=new FileInputStream("vivek.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.x+"::"+d1.y); //10::20
		
		//for transient variable
		System.out.println(d1.i+":::"+d1.j);//0:::40
		//for transient static variable
		System.out.println(d1.a+":::"+d1.b);//50:::0
		//for transient final variable
		System.out.println(d1.c+":::"+d1.d);//0:::80
		//both variable is final and transient
		System.out.println(d1.e+":::"+d1.f);//90:::100
		
		
	}

}
