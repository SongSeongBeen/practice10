package com.javaex.ch05;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea; //주소를 가르키는 변수
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		
	}
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int toal = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은" + toal +"입니다.");
	}
}
