package com.javaex.ch17;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;

//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		System.out.println("vip");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return super.calcPrice(price);
	}


	public int getAgentID() {
		return agentID;
	}

}
