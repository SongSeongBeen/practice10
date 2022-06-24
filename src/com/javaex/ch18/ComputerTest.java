package com.javaex.ch18;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		Computer noteBook = new NoteBook();
		
		Desktop desktop2 = new Desktop();
		desktop.display();
		desktop.turnOff();
		desktop2.test();
		
		noteBook.display();
		
	
	}
}
