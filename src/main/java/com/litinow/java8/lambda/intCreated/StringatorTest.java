package com.litinow.java8.lambda.intCreated;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StringatorTest {
	
	

	public static void main(String[] args) {
		
		Stringator stringatorGoUp = str -> { return str.toUpperCase(); };
		Stringator stringatorGoLower = (str) -> { return str.toLowerCase(); };
		Stringator stringatorOnlyFirstCharacter= (str) -> str.substring(0, 1); ;
		
		
		Predicate<String> predicateFirstLetterIsVowel = 
				e -> e.substring(0, 1).equals("A") || e.substring(0, 1).equals("E") || e.substring(0, 1).equals("I") || e.substring(0, 1).equals("O") || e.substring(0, 1).equals("U");
		
		Predicate<String> predicateFirstLetterIsA = e -> e.substring(0, 1).equals("A");		
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		if( isEven.test(20) ) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		
		if( isEven.test(25) ) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Potato"); arrayList.add("Onion"); arrayList.add("Carrot");
		arrayList.add("courgette"); arrayList.add("garlic"); arrayList.add("Pepper");
		arrayList.add("Cucumber"); arrayList.add("Grapes"); arrayList.add("Lettuce"); arrayList.add("Egg");
		arrayList.add("Oyster"); arrayList.add("Fish");
		

		for (int i = 0; i < arrayList.size(); i++) {
			if (i % 2 == 0) {				
				System.out.print(  stringatorGoUp.performStringChanges(arrayList.get(i))   );
				System.out.println( "\t" + stringatorOnlyFirstCharacter.performStringChanges(arrayList.get(i))   );
			} else {
				System.out.println(  stringatorGoLower.performStringChanges(arrayList.get(i))   );
			}
		}
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println( arrayList.get(i) + "\t\t\t" + predicateFirstLetterIsVowel.test( arrayList.get(i) ) + "\t" + predicateFirstLetterIsA.test( arrayList.get(i) ));
		}
		
		
		
		
	}
	
	
	
}
