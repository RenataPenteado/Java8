package com.litinow.java8.lambda.intCreated;

class Emp {
	String name;
	int performanceRating;
	double salary;

	Emp(String nm, int rating, double sal) {
		name = nm;
		performanceRating = rating;
		salary = sal;
	}

	public String getName() {
		return name;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return name + ":" + performanceRating + ":" + salary;
	}
}
