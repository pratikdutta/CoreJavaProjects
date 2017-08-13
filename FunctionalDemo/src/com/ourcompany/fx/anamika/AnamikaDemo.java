package com.ourcompany.fx.anamika;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnamikaDemo {

	public static void main(String[] args) {
		approach4(null);
	}
	
	public static void approach1(String[] args) {
		//Find the sum of all numbers which are less than 5
		List<Integer> list = Arrays.asList(1,3,4,6,7,8,9,10);
		Picker picker = new Picker();
		int total = 0;
		for (int e : list) {
			if(picker.pick(e)){
				total += e;
			}
		}
		System.out.println(total);
	}
	
	public static void approach2(String[] args) {
		//Find the sum of all numbers which are less than 5
		List<Integer> list = Arrays.asList(1,3,4,6,7,8,9,10);
		Pick picker = new Pick(){
			public boolean pick(int e){return e < 5;}
		};
		int total = 0;
		for (int e : list) {
			if(picker.pick(e)){
				total += e;
			}
		}
		System.out.println(total);
	}
	
	public static void approach3(String[] args) {
		//Find the sum of all numbers which are less than 5
		List<Integer> list = Arrays.asList(1,3,4,6,7,8,9,10);
		int total = 0;
		for (int e : list) {
			if(new Pick(){
				public boolean pick(int e){return e < 5;}
			}.pick(e)){
				total += e;
			}
		}
		System.out.println(total);
	}
	
	public static void approach4(String[] args) {
		//Find the sum of all numbers which are less than 5
		List<Integer> list = Arrays.asList(1,3,4,6,7,8,9,10);
		Predicate<Integer> isLessThan5 = e -> e < 5; 
		System.out.println(
			list.stream()		
				.filter(isLessThan5)
				.reduce(0, Math::addExact)
		);
	}
	
	
}

interface Pick{
	boolean pick(int e);
}

class Picker implements Pick{
	public boolean pick(int e){return e < 5;}
}