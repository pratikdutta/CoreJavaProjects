package com.sap.sortemployee;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortImplementation {
	
	public static void main(String[] string){
		
		Employee e1 = new Employee(1L, "S", 1000D);
		Employee e2 = new Employee(25L, "D", 2000D);
		Employee e3 = new Employee(12L, "T", 3000D);
		Employee e4 = new Employee(4L, "A", 4000D);
		Employee e5 = new Employee(19L, "M", 5000D);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);empList.add(e3);empList.add(e5);empList.add(e4);empList.add(e2);
		
		// Java7 method
//		Collections.sort(empList, new SortByNameComparator());
		
		// Lambda Method
		Collections.sort(empList, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println("Forward Sorting: "+empList);
		
		// Method Reference : Inverse Compare
		Collections.sort(empList, new SortByNameComparator()::inverseCompare);
		System.out.println("Reverse Sorting: "+empList);
		
		
		// Lambda Method
		Collections.sort(empList, (o1, o2) -> (o1.getId().compareTo(o2.getId())));
		System.out.println("Forward Sorting On Id: "+empList);
		
		// Method Reference : Inverse Compare
		Collections.sort(empList, new SortByIDComparator()::inverseCompare);
		System.out.println("Reverse Sorting On Id: "+empList);
		
	}

}
