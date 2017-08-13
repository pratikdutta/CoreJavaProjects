package com.sap.streams;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomStream1 {

	public static void main(String[] args) {
		
		List<String> strings = doJob(25, 3);
		System.out.println(strings);

	}
	
	private static List<String> doJob(int above, int divBy){
		above = above - (above % divBy) + divBy;
		IntPredicate ip1 = (q)->(q-1) % 10 == 0;
		
		Predicate<String> startEndCheck= value -> value.startsWith("4"); 
		
		List<String> integers = IntStream.iterate(above, (n)->(n+divBy)).filter(ip1).boxed()
		.map(value -> String.valueOf(value)).filter(startEndCheck).limit(5).collect(Collectors.toList());
		
		IntStream.iterate(above, (n)->(n+divBy)).filter(ip1).boxed()
		.map(value -> String.valueOf(value)).filter(startEndCheck).limit(5).forEach(System.out::println);
		return integers;
	}
}
