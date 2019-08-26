package com.litinow.java8.lambda.comparator.ex02;

public class Customer {
	String firstname;
	String surname;	
	
	public Customer(String firstname, String surname) {
		super();
		this.firstname = firstname;
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", surname=" + surname + "]\n";
	}
	
	
}
