package com.javaex.ch14;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public int getAgentID() {
		return agentID;
	}

}
