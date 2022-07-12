package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args)throws Exception {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		//for serializable
		FileOutputStream fos=new FileOutputStream("vivek.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.writeObject(b);
		oos.writeObject(c);
		oos.writeObject(d);
		//for de-serializable
		FileInputStream fis=new FileInputStream("vivek.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		A a1 = null;
		B b1= null;
		C c1= null;
		D d1= null;
		Object o=ois.readObject();
		
		if(o instanceof A) {
			a1=(A)o;
		}else if(o instanceof B) {
			b1=(B)o;
		}else if(o instanceof C) {
			 c1=(C)o;
		}else if(o instanceof D) {
			 d1=(D)o;
		}
		
		System.out.println(a1.x+"::"+a1.y);
		System.out.println(b1.b1+"::"+b1.b2);
		System.out.println(c1.x+"::"+c1.y);
		System.out.println(d1.x+"::"+d1.y);
	}
}
