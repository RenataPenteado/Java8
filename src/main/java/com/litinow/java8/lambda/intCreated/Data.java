package com.litinow.java8.lambda.intCreated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
	int value;

	Data(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}

	public static void main(String[] args) {
//		Data[] dataArr = new Data[] { new Data(1), new Data(2), new Data(3), new Data(4) };
//		List<Data> dataList = Arrays.asList(dataArr);
//		
//		dataList.removeIf((Data d) -> {
//			return d.value % 2 == 0;
//		});
			
		ArrayList<Data> arrayList = new ArrayList<>();
		arrayList.add(new Data(1));
		arrayList.add(new Data(2));
		arrayList.add(new Data(3));
		arrayList.add(new Data(4));

		List<Data> dataList = arrayList;
		
		dataList.removeIf((Data d) -> {
			return d.value % 2 == 0;
		});
		
		System.out.println( dataList );
		
		ArrayList<String> arrayStr = new ArrayList<>();
		arrayStr.add("a");
		arrayStr.add("b");
		arrayStr.add("c");
		arrayStr.add("d");
			
		
		arrayStr.removeIf((s) -> {return s.equals("a");});
		
		System.out.println( arrayStr );
		
		
		
//		for (Data element : dataList) {
//			dataList.removeIf((Data d) -> {
//				return d.value % 2 == 0;
//			});
//			System.out.println("Removed " + d + ", ");
//		}
	}
}
