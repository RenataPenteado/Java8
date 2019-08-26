package com.litinow.java8.lambda.intCreated;

import java.util.ArrayList;

public class Test {
	// public static void main(String args[]) {

	int x = 5;

	int getX() {
		return x;
	}

	public static void main(String args[]) throws Exception {
		Test tc = new Test();
		tc.looper();
		System.out.println(tc.x);
	}

	public void looper() {
		int x = 0;
//		System.out.println("antes");
//		while ((x = getX()) != 0) {
//			for (int m = 10; m >= 0; m--) {
//				x = m;
//			}
//			System.out.println("meio");
//		}
//		System.out.println("depois");
		
		Emp e1 = new Emp("Shreya", 6, 9999.00);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2769.00);
		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		Validate validatePerfor = e -> e.getPerformanceRating() >= 5;
		filter(empArrList, validatePerfor);
	}

	static void filter(ArrayList<Emp> list, Validate rule) {
		for (Emp e : list) {
			if (rule.check(e)) {
				System.out.println(e);
			}
		}
	}
}
