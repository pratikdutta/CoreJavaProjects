package custompack;

import collectionsTest.MyLinkedList;
import collectionsTest.MyList;

public class PersonInList {

	public static void main(String[] args) {
		MyList<Person> persList = new MyLinkedList<Person>();
		persList.add(new Person("A", 1));
		persList.add(new Person("B", 2));
		persList.add(new Person("C", 3));
		persList.add(new Person("D", 4));
		persList.add(new Person("E", 5));
		persList.add(new Person("F", 6));
		persList.add(new Person("G", 7));
		
		System.out.println("Value @ 3: "+persList.get(2));

	}

}
