package com.javaex.ch03;

public class StudentTest {
	
	public static void main(String[] args) { //웹서버가 없어서 스테틱메인 시동메서드 사용
		
		Student studentLee = new Student();
		
		Student studentHee = new Student(123,"ddd",3);
		
		String data = studentLee.showStudentInfo();
		String data2 = studentHee.showStudentInfo();
		System.out.println(data);
		System.out.println(data2);
	}

}
