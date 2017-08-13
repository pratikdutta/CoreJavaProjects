package com.ourcompany.fx.create_streams;

import java.util.Arrays;

public class FromArrays {
	public static void main(String[] args) {
//		int[] numbers = null;// { 1, 2, 3, 4, 5, 6, 7 };
		int[] numbers = {  };
	    int sum = Arrays.stream(numbers).sum();
//	    int sum = Arrays.stream(
	    System.out.println("sum = " + sum);
	}
}
