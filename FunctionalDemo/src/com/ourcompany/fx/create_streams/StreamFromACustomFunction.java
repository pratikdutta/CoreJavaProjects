package com.ourcompany.fx.create_streams;

import java.util.function.Supplier;
import java.util.stream.Stream;
public class StreamFromACustomFunction {
	static int number = 1; 
	public static void main(String[] args) {
		
//		Supplier<Integer> factorialSupplier = () -> factorial();
		Supplier<Integer> factorialSupplier = StreamFromACustomFunction::factorial;
		
		Stream.generate(factorialSupplier)
		
//		Stream.generate(() -> factorial() )
//		Stream.generate(StreamFromACustomFunction::factorial)
			.limit(4).forEach(System.out::println);
	}
	
	static int factorial(){
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		number++; 		return fact;
	}
}
