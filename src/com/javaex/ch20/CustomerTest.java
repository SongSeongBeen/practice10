package com.javaex.ch20;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerT = new Customer(10010, "송");
		Customer customerS = new GoldCustomer(10020, "김");
		Customer customerA = new VIPCustomer(10030, "이");

		customerList.add(customerT);
		customerList.add(customerS);
		customerList.add(customerA);

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + cost);
			System.out.println(customer.getCustomerName()+ "님의" + "보너스포인트" + customer.bonusPoint);
		}

	}

}
