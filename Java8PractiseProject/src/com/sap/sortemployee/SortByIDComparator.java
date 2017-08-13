package com.sap.sortemployee;

import java.util.Comparator;

public class SortByIDComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getId().compareTo(o2.getId()));
	}
	
	public int inverseCompare(Employee o1, Employee o2){
		return (o2.getId().compareTo(o1.getId()));
	}
}
