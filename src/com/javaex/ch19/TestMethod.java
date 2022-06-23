package com.javaex.ch19;

public class TestMethod {
	
	int num; //전역변수(객체변수)
	
	void aaa() {
		System.out.println("aaa() 호출 한글이 한글 지워지");
	}
							//main()함수의 지역변수 args 지역변수 스택메모리
	public static void main(String[] args) {
		TestMethod a1 = new TestMethod();
		//a1의 num 힙메모리
		a1.aaa(); //aaa() 메서드 영역
		//a1 스택 메모리
		TestMethod a2 = new TestMethod();
		//a2의 num 힙메모리
		a2.aaa();
	}
}
