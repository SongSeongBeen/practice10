package com.javaex.ch04;

public class PersonTest {
	
	public static void main(String[] args) {
	
	Person personTomas = new Person(180,78,"남성","Tomas",37);
	
	String date = personTomas.showPersonInfo();
	
	System.out.println(date);
	
	}
}
