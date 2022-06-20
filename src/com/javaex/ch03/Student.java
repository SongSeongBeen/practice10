package com.javaex.ch03;

public class Student {
	
	int studentNumber;
	String studentName;
	int grade; //자동으로 초기화 됨 멤버변수
	
	public Student() {} //요소가 없을 상황에서는 만들지 않아도 된다.
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showStudentInfo() {
		//int i; 지역변수 초기화 해줘야함
		return studentName + "학생의 학번은" + studentNumber + "이고" + grade +"학년 입니다.";
	}
}
