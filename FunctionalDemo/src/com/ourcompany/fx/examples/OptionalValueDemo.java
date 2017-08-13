package com.ourcompany.fx.examples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class OptionalValueDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList();
//		List<Integer> list = Arrays.asList(1,34,56,7,8,10);
		
		Optional<Integer> optionalMin = list.parallelStream().min( (e1, e2) ->  (e1 < e2) ? -1 : (e1==e2) ?  0 : 1 );
		boolean present = optionalMin.isPresent();
		
		if(present){
			System.out.println("min="+optionalMin.get());
		}else{
			System.out.println("Min value is not applicable as there are no values");
		}
		//automatically the minValue is supplied to the consumer
		optionalMin.ifPresent(minValue -> System.out.println("minValue="+minValue));
		
		optionalMin.ifPresent(element -> System.out.println("min="+optionalMin.get()));
		
		
//		optionalMin.orElseThrow(RuntimeException::new);
//		System.out.println("You may not see me!!!");

		
		int defaultValue = -1;
		int min = optionalMin.orElse(defaultValue);
		System.out.println("min="+min);

	}

}
