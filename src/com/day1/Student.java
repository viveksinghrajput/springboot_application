package com.day1;

public class Student {
	
	public int id;
	public String name;
	public int age;
	
	public int getId() {
		return id;
	}
	public Student setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
