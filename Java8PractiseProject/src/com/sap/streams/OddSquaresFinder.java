package com.sap.streams;

import java.util.stream.IntStream;

public class OddSquaresFinder {
	
	/**
	 * @Question Find the sum of all squares of odd numbers ranging from 10-20
	 * @param args
	 */

	public static void main(String[] args) {
		int p = IntStream .range(10,20).parallel().filter(OddSquaresFinder::isOdd)
		.filter(OddSquaresFinder::divBy3).map(v -> v*v)
		.reduce(0, (l,r)-> l+r);
		
		System.out.println(p);
	}
	
	static boolean isOdd(int number){
		return number % 2 !=0;
	}
	
	static boolean divBy3(int number){
		return number % 3 ==0;
	}

}
