package com.litinow.java8.functionalInterfaces;

import java.util.function.Supplier;

public class SuppliersExample {

	public static void main(String[] args) {
		
		Supplier<Person> supplier = () -> { 
			return new Person("Renata", 30 );
		};
		
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge());
	}
}
