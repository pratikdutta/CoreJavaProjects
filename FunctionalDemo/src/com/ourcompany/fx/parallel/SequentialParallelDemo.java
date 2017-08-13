package com.ourcompany.fx.parallel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SequentialParallelDemo {

public static void main(String[] args) {
	int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	IntStream stream = Arrays.stream(array);
	System.out.println(stream.isParallel());
	System.out.println(stream.sequential().isParallel());
	System.out.println(stream.parallel().isParallel());
	System.out.println(stream.parallel().sequential().parallel().sequential().isParallel());
	stream.forEach(System.out::println);
}
}
