package com.practice.test;
//egger initialization 
class SingletonEgger{
	private static SingletonEgger instance=new SingletonEgger();
	public SingletonEgger() {
	}
	static SingletonEgger getInstance() {
		return instance;
	}
}
class SingletonClassEgger {
	public static void main(String[] args) {
		SingletonEgger se=SingletonEgger.getInstance();
		System.out.println(se);
		SingletonEgger se1=SingletonEgger.getInstance();
		System.out.println(se1);
	}

}
