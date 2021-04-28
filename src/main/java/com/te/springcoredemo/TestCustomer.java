package com.te.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
		   Customer customer = (Customer) context.getBean("customer2");  
		   System.out.println( "customer id is "+customer.getId());
		   System.out.println( "customer name is "+ customer.getCustomername());
		   System.out.println("cutomer order id "+customer.getMyorders().getOrderid());
		   System.out.println("product name "+customer.getMyorders().getProductname());
		   if(context!=null)
		((AbstractApplicationContext) context).close();  
	}

}
