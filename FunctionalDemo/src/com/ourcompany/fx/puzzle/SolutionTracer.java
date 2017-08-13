package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;
/*
 * With terminal operations
 */
public class SolutionTracer {
	
	public static void main(String[] args) {
		//Find the square of the smallest even number which is greater than 5
		//from a given list of values
		List<Integer> values = Arrays.asList(1, 10, 4, 5, 7, 8, 9, 10, 12);
		System.out.println(
				values.stream()
					  .filter(SolutionTracer::isEven)//intermediate operations	
					  .filter(SolutionTracer::isGreaterThan5)
					  .map(SolutionTracer::getSquare) //intermediate operations
					  .findFirst()//terminal operations
					  .get()//terminal operations
		);		
	}
	
	static boolean isEven(int number){
		System.out.printf("%d isEven ?%n", number);
		return number % 2 == 0;
	}
	
	static boolean isGreaterThan5(int number){
		System.out.printf("%d isGreaterThan5 ?%n", number);
		return number > 5;
	}
	
	static int getSquare(int number){
		System.out.printf("getSquare of %d%n", number);
		return number * number;
	}
	
}
