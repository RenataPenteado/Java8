package com.litinow.java8.lambda.comparator.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LambdaSortForFirstName {
	Set<Customer> customersSet = new HashSet<Customer>();

	public LambdaSortForFirstName() {
		customersSet.add(new Customer("Jhon", "Doe"));
		customersSet.add(new Customer("Alice", "In Chains"));
		customersSet.add(new Customer("Petter", "MacDonalds"));
		customersSet.add(new Customer("Paul", "Mccartney"));
		customersSet.add(new Customer("Julia", "Roberts"));
	}

	public ArrayList<Customer> performSorting() {
		ArrayList<Customer> list = new ArrayList<Customer>(customersSet);
		
		Collections.sort(list, new Comparator<Customer>() {
			public int compare(Customer cust1, Customer cust) {
				return cust1.getFirstname().compareTo(cust.getFirstname());
			}
		});

		Collections.sort(list, (cust1, cust2) -> cust1.getFirstname().compareTo(cust2.getFirstname())

		);
		return list;
	}

	public static void main(String[] args) {
		LambdaSortForFirstName ldfn = new LambdaSortForFirstName();
		ldfn.performSorting();

		System.out.println(ldfn.performSorting());
	}

}
