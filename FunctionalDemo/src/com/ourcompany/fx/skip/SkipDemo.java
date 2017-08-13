package com.ourcompany.fx.skip;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {

	public static void main(String[] args) {
		//Find the number of elements in an array excluding the first 3
		List<Integer> list = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
		long count = list.stream()
			.skip(3)
			.count();
		System.out.println(count);
	}
}
