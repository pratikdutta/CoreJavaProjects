package com.java8.streams01;

public class ImplementFI02 {

	public static void main(String[] args) {
		FuncInterface fi = (p) ->  p>10;
		System.out.println(fi.gt10(13));
	}
}
