package com.ourcompany.fx.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class ParallelDemo {

	public static void main(String[] args){
		//find the sum of all numbers where the number is bla...bla...bla...
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> predicate = e -> isBlaBlaBla(e);
		{
			long startTime = System.currentTimeMillis();
			System.out.println(
				list.stream()
					.filter(predicate)
					.reduce(0,(x,y) -> Math.addExact(x,y))
					);
			long endTime = System.currentTimeMillis();
			System.out.printf("Total time taken with sequential stream: %d %n",(endTime-startTime) );
		}
		{
			long startTime = System.currentTimeMillis();
			System.out.println(
					list.parallelStream()
					.filter(predicate)
					.reduce(0,(x,y) -> Math.addExact(x,y))
					);
			long endTime = System.currentTimeMillis();
			System.out.printf("Total time taken with parallel stream: %d %n",(endTime-startTime) );
		}
	}
	static boolean isBlaBlaBla(int e){
		//evaluate all the condition which takes one minute
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return true;
	}
}
