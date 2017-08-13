package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTestEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("A", 23, "ABC"));
		emps.add(new Employee("D", 24, "DEF"));
		emps.add(new Employee("G", 25, "GHAI"));
		emps.add(new Employee("J", 26, "JKL"));
		
		emps.forEach(empl -> {
			System.out.println(empl);
		if("A".equalsIgnoreCase(empl.getName())){
			System.out.println("This is Mr A.");
		}
		});
		
		System.out.println("************************");
		
		emps.stream().filter(empl -> empl.getAddress().contains("A"))
		.forEach(System.out::println);

	}
}
