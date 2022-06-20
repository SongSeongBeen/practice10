package com.javaex.ch04;

public class Person {
	
	private int stature;
	private int weight;
	private String gender;
	private String userName;
	private int age;
	
	public Person(int stature, int weight, String gender, String userName, int age) {
		this.stature = stature;
		this.weight = weight;
		this.gender = gender;
		this.userName = userName;
		this.age = age;
	}
	
	public String showPersonInfo() {
		System.out.println("키가" + stature + "이고, 몸무게가" + weight + "킬로인 " + gender +"이 있습니다. 이름은" + userName + "이고, 나이는" + age + "세입니다.");	
		return showPersonInfo();
	}
	

}
