package com.javaex.ch16;

public class CustomerTest {
	
	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(1000,"이순신");
//		customerLee.bonusPoint = 1000;
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(1234,"noname");
		vc.bonusPoint = 10000;
		
		System.out.println(vc.showCustomerInfo());
	}
	
}
