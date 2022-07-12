package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "vivek";
	transient String password = "Incorrect@123";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String Apassword = "123" + password;
		oos.writeObject(Apassword);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
	}
}

class CustomizedSerializable {

	public static void main(String[] args) throws Exception {
		Account ac = new Account();
		System.out.println(ac.userName + "::::" + ac.password);
		// for serializable
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ac);

		// for de-serializable
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a = (Account) ois.readObject();

		System.out.println(a.userName + "::::::" + a.password);

	}

}
