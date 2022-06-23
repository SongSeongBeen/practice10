package com.javaex.ch20;

public class GoldCustomer extends Customer{

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
}
