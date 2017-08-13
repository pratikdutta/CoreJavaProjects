package com.ourcompany.fx.create_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class IntLongDoubleStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> streamOfInteger = list.stream();
//		IntStream intStream = list.stream().mapToInt(i -> i);
		IntStream intStream = list.stream().mapToInt((Integer iObj) -> {return iObj.intValue();});
		DoubleStream doubleStream = list.stream().mapToDouble(i -> i);
		LongStream longStream = list.stream().mapToLong(i -> i);
		doubleStream.forEach(System.out::println);
	}
}
