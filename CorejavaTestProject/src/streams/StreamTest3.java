package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest3 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		System.out.println("****************************");
		items.forEach(System.out::println);
	}
	
}
