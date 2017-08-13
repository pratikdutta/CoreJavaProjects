package com.java8.streams01;

public class ImplementFI01 {
	
	public static void main(String[] args) {
		FuncInterface fi = new FuncInterface() {
			@Override
			public boolean gt10(int n) {
				return n>10;
			}
		};
		System.out.println(fi.gt10(2));
	}
}
