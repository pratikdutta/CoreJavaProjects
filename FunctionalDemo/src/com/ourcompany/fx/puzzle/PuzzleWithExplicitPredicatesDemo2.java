package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/*
 * PFMR = PuzzleFunctionalMethodReference
 */
public class PuzzleWithExplicitPredicatesDemo2 {
	
	public static void main(String[] args) {
		//Find the square of the smallest even number which is greater than 5
		//from a given list of values
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 12);
		//applies the Integer on the predicate and returns the predicate
		Function<Integer, Predicate<Integer>> isGreaterThan =
				limit -> e -> e > limit; 
//				limit -> (e -> e > limit); 
//				limit -> (e -> (e > limit)); 
		System.out.println(
				values.stream()
					  .filter(e -> e % 2 == 0)
					  .filter(isGreaterThan.apply(5))// pass the returned predicate here
					  .map(e -> e * e) 
					  .findFirst()
					  .get()
		);		
	}

}
