package com.manish.javadev.services;

@SuppressWarnings("unused")
public class CustomerService {
	public void addCustomer() {
		System.out.println("Add Customer");
		System.out.println("Add Customer Logic Done");
		System.out.println("Add Customer End");
	}

	public void updateCustomer() {
		System.out.println("Update Customer");
		System.out.println("Update Customer Logic Done");
		System.out.println("Update Customer End");
	}

	public String getCustomer(int index) {
		System.out.println("Get Customer Start");
		if (index == 1) {
			System.out.println("Get Customer Going to throw Exception");
			int value = 10 / 0;
		}
		System.out.println("Get Customer Logic Done");
		System.out.println("Get Customer Completed");
		return "Manish Srivastava Java Developer";
	}
}