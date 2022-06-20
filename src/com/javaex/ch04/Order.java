package com.javaex.ch04;

public class Order {
	
	public Long orderNumber;
	public int phoneNumber;
	public String orderAddress;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int orderNo;
	
	public Order(Long orderNumber, int phoneNumber, String orderAddress, int orderDate, int orderTime, int orderPrice,
			int orderNo) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderNo = orderNo;
	}
	
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", phoneNumber=" + phoneNumber + ", orderAddress=" + orderAddress
				+ ", orderDate=" + orderDate + ", orderTime=" + orderTime + ", orderPrice=" + orderPrice + ", orderNo="
				+ orderNo + "]";
	}
	

	public String showInfo() {
		
		System.out.println("주문 접수 번호:" + orderNumber);
		System.out.println("주문 핸드폰 번호:" + phoneNumber);
		System.out.println("주문 집 주소 :" + orderAddress);
		System.out.println("주문 날짜:" + orderDate);
		System.out.println("주문 시간:" + orderTime);
		System.out.println("주문 가격:" + orderPrice);
		System.out.println("메뉴 번호:" + String.format ("%03d", orderNo));
		
		return showInfo();
	}
	
	
	
	
	

}
