package com.java8.api;

import java.util.List;

public class Student {
	int studentId;
	String name;
	List<String> cityWhereStudy;
	
	public Student() {
	}
	public Student(int studentId, String name, List<String> cityWhereStudy) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.cityWhereStudy = cityWhereStudy;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCityWhereStudy() {
		return cityWhereStudy;
	}
	public void setCityWhereStudy(List<String> cityWhereStudy) {
		this.cityWhereStudy = cityWhereStudy;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", cityWhereStudy=" + cityWhereStudy + "]";
	}
	
}
