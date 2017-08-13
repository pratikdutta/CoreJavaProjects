package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/*
 * PFMR = PuzzleFunctionalMethodReference
 */
public class PuzzleWithExplicitPredicates {
	
	public static void main(String[] args) {
		//Find the square of the smallest even number which is greater than 5
		//from a given list of values
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 12);
		
		Predicate<Integer> isEven = e -> e % 2 == 0;
		Predicate<Integer> isGreaterThan5 = e -> e > 5;
		Function<Integer, Integer> getSquare = e -> e * e;
		
		System.out.println(
				values.stream()
					  .filter(isEven)//intermediate operations	
					  .filter(isGreaterThan5)
					  .map(getSquare) //intermediate operations
					  .findFirst()//terminal operations
					  .get()//terminal operations
		);		
	}

}
