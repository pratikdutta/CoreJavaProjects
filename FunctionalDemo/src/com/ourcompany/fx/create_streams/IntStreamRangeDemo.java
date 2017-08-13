package com.ourcompany.fx.create_streams;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntStreamRangeDemo {
	public static void main(String[] args) {
//		IntStream.range(startInclusive, endExclusive)
		IntStream.range(10, 12).forEach(System.out::println);
//		IntStream.rangeClosed(startInclusive, endInclusive)
		IntStream.rangeClosed(500, 502).forEach(System.out::println);
	}
}
