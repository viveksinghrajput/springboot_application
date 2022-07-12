package com.practice.test;

class LazyInitializationSingleton{
	private static LazyInitializationSingleton instance;

	public LazyInitializationSingleton() {
	}
	public static  LazyInitializationSingleton getInstance() {
		if(instance==null) {
			synchronized (LazyInitializationSingleton.class) {
				instance=new LazyInitializationSingleton();
			}
		}
		return instance;
	}
	
}

class LazyInitializationSingletonClass {
	public static void main(String[] args) {
		LazyInitializationSingleton ls=LazyInitializationSingleton.getInstance();
		System.out.println(ls);
		LazyInitializationSingleton ls1=LazyInitializationSingleton.getInstance();
		System.out.println(ls1);
	}

}
