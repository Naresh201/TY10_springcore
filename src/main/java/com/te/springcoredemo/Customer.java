package com.te.springcoredemo;

import lombok.Data;

@Data
public class Customer {
	public Customer() {	
	}
	private MyOrders myorders;
	private String customername;
	private int id;
}
