package com.te.springcoredemo;

import lombok.Data;

@Data
public class MyOrders {
	public MyOrders() {
	}
	private int orderid;
	private String productname;
}
