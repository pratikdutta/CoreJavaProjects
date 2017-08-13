package com.ourcompany.fx.create_streams;

import java.util.stream.Stream;

public class EmptyStream {

	public static void main(String[] args) {
		Stream<String> emptyStream = Stream.empty();
		long val = emptyStream.count();
		System.out.println("val = " + val);
	}

}
