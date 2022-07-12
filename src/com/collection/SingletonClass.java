package com.collection;

public class SingletonClass {
	
	private static SingletonClass singleton;

	private SingletonClass() {
	}
	public static SingletonClass getInstance() {
		
		if(singleton==null) {
			singleton=new SingletonClass();
		}
		return singleton;
	}
	public static void main(String[] args) {
		SingletonClass sc=SingletonClass.getInstance();
		SingletonClass sc1=SingletonClass.getInstance();
		System.out.println(sc.hashCode()+"::"+sc1.hashCode());
		System.out.println(sc==sc1);
	}

}
