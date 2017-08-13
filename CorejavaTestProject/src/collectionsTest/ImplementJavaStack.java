package collectionsTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class ImplementJavaStack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("TUP");
		st.push("CAT");
		st.push("MAT");
		st.push("KHIT");
		st.push("MIT");
		st.push("CHAP");
		st.push("CHUP");
		st.push("TIP");
		
		for (String s : st) {
			System.out.println(s);
		}
		
		st.pop();
		System.out.println("\nAfter Popping");
		for (String s : st) {
			System.out.println(s);
		}
		
		Collections.sort(st, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("\nAfter Sorting");
		for (String s : st) {
			System.out.println(s);
		}
	}
}
