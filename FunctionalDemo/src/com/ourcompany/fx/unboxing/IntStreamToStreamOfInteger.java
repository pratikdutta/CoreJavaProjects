package com.ourcompany.fx.unboxing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class IntStreamToStreamOfInteger {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 78);

		IntStream intStream = list.stream().mapToInt(Integer::intValue);
		// IntStream intStream = list.stream().mapToInt(i -> i);

		// intStream.forEach(System.out::println);

		Stream<Integer> streamOfInteger = intStream.boxed();
		streamOfInteger.forEach(System.out::println);
		
	}

}
