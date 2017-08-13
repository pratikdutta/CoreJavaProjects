package com.java8.streams01;

import java.util.stream.IntStream;

public class PrimeFinder {
	public static void main(String[] args) {
		for (int i = 3; i < 10; i++) {
			System.out.printf("%d is prime? %b %n", i, isPrime(i));
		}
	}

	static boolean isPrime(int number) {
		// describe what to do and not how to do
		return IntStream.range(2, number).noneMatch(
				index -> number % index == 0);
	}
}