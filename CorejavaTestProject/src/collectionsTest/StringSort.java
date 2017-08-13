package collectionsTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> sl = new ArrayList<String>();
		sl.add("X");
		sl.add("A");
		sl.add("R");
		sl.add("H");
		sl.add("C");
		sl.add("K");
		sl.add("D");
		try{
			Collections.sort(sl, new Comparator<String>(){
				
				@Override
				public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
					return s2.compareTo(s1);
				}
			});
			
		}catch(NullPointerException we){
			
		}
		
		
		for (String string : sl) {
			System.out.println(string);
		}
	}
}
