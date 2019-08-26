package com.litinow.java8.lambda.comparator.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LambdaSortForSurname {

	public static void main(String[] args) {
		Set<Customer> customersSet = new HashSet<Customer>();

		customersSet.add(new Customer("Jhon", "Doe"));
		customersSet.add(new Customer("Alice", "In Chains"));
		customersSet.add(new Customer("Petter", "MacDonalds"));
		customersSet.add(new Customer("Paul", "Mccartney"));
		customersSet.add(new Customer("Julia", "Roberts"));

		ArrayList<Customer> list = new ArrayList<Customer>(customersSet);
		Collections.sort(list, (cust1, cust2) -> cust1.getSurname().compareTo(cust2.getSurname()) );

		System.out.println(list);
	}

}
