package com.sap.sortemployee;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getName().compareTo(o2.getName()));
	}
	
	public int inverseCompare(Employee o1, Employee o2){
		return (o2.getName().compareTo(o1.getName()));
	}
}
