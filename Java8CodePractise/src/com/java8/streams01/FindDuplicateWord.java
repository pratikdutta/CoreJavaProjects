package com.java8.streams01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FindDuplicateWord {
	static List<String> strList = new ArrayList<>();
	static Set<String> duplicatesRemovedSet = new HashSet<>();

	public static void main(String[] args) {
		String s = "A DOG IS A DOG WHO IS ALSO A DOG";
		String[] strArr = s.split("\\s+");
		FindDuplicateWord f = new FindDuplicateWord();
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.filter(p -> f.checkDuplicate(p)).forEach(System.out::println);
	
		/**
		 * WRONG INPLEMENTATION
		 */
		/*String[] words = s.split(" ");
	    Set<String> duplicatesRemovedSet = new HashSet<>();
	    List<String> duplicates = Arrays.stream(words).filter(
	            string -> !duplicatesRemovedSet.add(string)).collect(Collectors.toList());
	    duplicates.forEach(System.out::println);*/
	
	}
	
	private boolean checkDuplicate(String st){
		if(!duplicatesRemovedSet.add(st)){
			if(!strList.contains(st)){
        		strList.add(st);
        		return true;
        		}
			return false;
        	}
		return false;
	}
}
