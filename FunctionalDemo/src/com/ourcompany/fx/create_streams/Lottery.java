package com.ourcompany.fx.create_streams;

import java.util.stream.Stream;

public class Lottery {

	public static void main(String[] args) {
		Stream.generate(Math::random)
			.limit(6)
			.map(Math::round)
			.forEach(System.out::println);
	}
	
}
