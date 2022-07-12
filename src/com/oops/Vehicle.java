package com.oops;

class Vehicle {
	int maxSpeed=120;
}
class Car extends Vehicle{
	int maxSpeed=180;
	void display() {
		System.out.println("Maximum Speed :: "+maxSpeed);
		System.out.println("Maximum Speed :: "+super.maxSpeed);
	}
}
