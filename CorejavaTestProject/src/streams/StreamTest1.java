package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest1 {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(2).forEach(System.out::println);
		
		System.out.println("*************************");
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct()
				.collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
	}
}
