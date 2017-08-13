package com.ourcompany.fx.create_streams;

import java.util.stream.IntStream;

public class StreamBuilder {

	public static void main(String[] args) {
		long count = IntStream.builder().add(10).add(20).build().count();
		System.out.println(count);
	}

}
