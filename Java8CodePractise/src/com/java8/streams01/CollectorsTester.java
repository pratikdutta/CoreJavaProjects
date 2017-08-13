package com.java8.streams01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTester {
	
	public static void main(String[] args) {
		List<String>strings = Arrays.asList("abc", "", "bc","jkl", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		List<String>strings_01 = Arrays.asList("abc", "", "bc","jkl", "efg", "abcd","", "jkl");
		Set<String> filtered_01 = (Set<String>) strings.stream().filter(string -> !string.isEmpty())
				.collect(Collectors.toSet());
		filtered_01.forEach(System.out::println);
		
	}

}
