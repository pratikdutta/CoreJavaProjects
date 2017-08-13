package com.ourcompany.fx.examples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class SumAverageMinMax {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,34,56,7,8,10);
		
		int count = (int) list.parallelStream().count();
		System.out.println("count="+count);

		Integer sum = list.parallelStream().reduce(0,(e1, e2) -> (e1+e2));
		System.out.println("sum="+sum);

		Optional<Integer> optionalMin = list.parallelStream().min( (e1, e2) ->  (e1 < e2) ? -1 : (e1==e2) ?  0 : 1 );
		System.out.println("min="+optionalMin.get());

		BinaryOperator<Integer> divider = (s,c) -> s / c;
		int average = divider.apply(sum, count);
		System.out.println("average="+average);
		
		Optional<Integer> optionalMax = list.parallelStream().max( (e1, e2) ->  (e1 > e2) ? +1 : (e1==e2) ?  0 : -1 );
		Integer max = optionalMax.get();
		System.out.println("max="+max);
		
        IntSummaryStatistics summaryStatistics = list.parallelStream().mapToInt(e -> e).summaryStatistics();
        System.out.println("summaryStatistics="+summaryStatistics);
//        summaryStatistics.getCount();
//        summaryStatistics.getSum();
        
		
	}

}
