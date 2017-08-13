package com.ourcompany.fx.puzzle;

import java.util.Arrays;
import java.util.List;

public class PuzzleImperative {
	public static void main(String[] args) {
		//Find the square of the smallest even number which is greater than 5
		//from a given list of values
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 7, 8, 9, 10, 12);
		int result = 0;
		for (int value : values) {
			if((value % 2 == 0) && (value > 5)){
				result = value * value;
				break;
			}
		}
		System.out.println(result);
	}
}
