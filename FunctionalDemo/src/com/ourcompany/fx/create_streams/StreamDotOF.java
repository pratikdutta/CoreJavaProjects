package com.ourcompany.fx.create_streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDotOF {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("This ", " is",
	            "   really ", "       cooool!!!");
	    String joined = stream.map(String::trim).collect(
	            Collectors.joining(" "));
	    System.out.println(joined);
	}
}
