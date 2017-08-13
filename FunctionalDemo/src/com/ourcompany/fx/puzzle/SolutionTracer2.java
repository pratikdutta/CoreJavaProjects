package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Without terminal operations
 */
public class SolutionTracer2 {

	public static void main(String[] args) {
		// Find the square of the smallest even number which is greater than 5
		// from a given list of values
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 12);
		Stream<Integer> map = 
			values.stream()
				  .filter(SolutionTracer2::isEven)// intermediate operations
				  .filter(SolutionTracer2::isGreaterThan5)
				  .map(SolutionTracer2::getSquare); // intermediate operations
//		System.out.println(map.findFirst().get()); // terminal operations
	}

	static boolean isEven(int number) {
		System.out.printf("%d isEven ?%n", number);
		return number % 2 == 0;
	}

	static boolean isGreaterThan5(int number) {
		System.out.printf("%d isGreaterThan5 ?%n", number);
		return number > 5;
	}

	static int getSquare(int number) {
		System.out.printf("getSquare of %d%n", number);
		return number * number;
	}

}
