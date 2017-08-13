package com.sap.streams;

import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @Question Find cube of the first odd number which is b/w x&y and div by p
 * @author pdutt6
 *
 */
public class Cube {
	
	public static void main(String[] args) {
		int m = doJob(0, 20, 5);
		System.out.println(m);
	}
	
	private static int doJob(int x, int y, int p){
		IntPredicate ip = (q)-> q % p == 0;
		OptionalInt op = IntStream.range(x,y).parallel().filter(OddSquaresFinder::isOdd)
				.filter(ip).map(v -> v*v*v).findFirst();
		
		return op.getAsInt();
		
	}
}
