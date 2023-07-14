package com.shop.vo;

import java.util.Set;

public class OrderVO {
	
	private int orderNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	// 추가필드
	private String name;
	private String prodName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProd() {
		return prodName;
	}
	
	public void setProd(String prod) {
		this.prodName = prod;
	}
	
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public int getOrderProduct() {
		return orderProduct;
	}
	
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	
	public int getOrderCount() {
		return orderCount;
	}
	
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return orderNo+","+orderId+","+orderProduct+","+orderCount;
	}

}
