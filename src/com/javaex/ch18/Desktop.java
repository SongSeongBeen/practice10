package com.javaex.ch18;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turnOff");
	}

	void test() {
		System.out.println("test");
	}
	

}
