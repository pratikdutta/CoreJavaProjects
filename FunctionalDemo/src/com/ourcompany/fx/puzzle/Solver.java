package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;
/*
 * Method references
 */
public class Solver {
	
	public static void main(String[] args) {
		//Find the square of the smallest even number which is greater than 5
		//from a given list of values
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 12);
		System.out.println(
				values.stream()
					  .filter(Solver::isEven)	
					  .filter(Solver::isGreaterThan5)
					  .map(Solver::getSquare)
					  .findFirst()
					  .get()
		);		
	}
	
	static boolean isEven(int number){
		return number % 2 == 0;
	}
	
	static boolean isGreaterThan5(int number){
		return number > 5;
	}
	
	static int getSquare(int number){
		return number * number;
	}
	
}
