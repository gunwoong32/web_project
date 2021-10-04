package com.mega.mvc05.static1;

public class 직원 {
	String name;
	char gender;
	int age;
	static int count;
	static int sum;
	
	public 직원(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum += age;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
