package pack1;

import java.util.HashSet;

public class SQ {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println("_________________________________________");
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(end);
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		
		System.out.println("_________________________________________");
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		
		System.out.println("_________________________________________");
		
		boolean flag = false;
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
	}
}
