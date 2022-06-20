package com.javaex.ch08;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("no name", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(); //heap 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소값
		person.showPerson();
		
		System.out.println(person); 
		
		Person person2 = person.getPerson(); //heap 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소값
		System.out.println(person2); 
		
	}
	
	

}
