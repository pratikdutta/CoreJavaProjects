package com.ourcompany.fx;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeFinder {
	public static void main(String[] args) {
		for (int i = 3; i < 10; i++) {
			System.out.printf("%d is prime? %b %n", i, isPrime(i));
		}

	}
	static boolean isPrime(int number){
		IntPredicate isDivisible = divisor -> number % divisor == 0;
		return IntStream.range(2, number)
						.noneMatch(isDivisible);
		
	}
}

