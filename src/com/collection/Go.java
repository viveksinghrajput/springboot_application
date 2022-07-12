package com.collection;

public class Go {
	
		public static void main(String[] args) {
			ImmutableClass ic=new ImmutableClass();
			System.out.println(ic.getId());
			System.out.println(ic.getName());
			System.out.println(ic.getSalary());
		}
}
