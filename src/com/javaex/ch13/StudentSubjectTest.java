package com.javaex.ch13;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 100);
		
		studentLee.showScoreInfo();
	}

}
