package com.ourcompany.fx.create_streams;

import java.util.stream.Stream;

public class StreamFromAFunction {
	public static void main(String[] args) {
//		 Stream.iterate(10, n -> n + 2).forEach(System.out::println);
		 Stream.iterate(10, n -> ((n + 2) % 100)).forEach(System.out::println);
//		 Stream.iterate(100, n -> n + 3).limit(5).forEach(System.out::println);
	}
}
