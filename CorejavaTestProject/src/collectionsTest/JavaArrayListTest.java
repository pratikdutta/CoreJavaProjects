package collectionsTest;

public class JavaArrayListTest {

	public static void main(String[] args) {
		java.util.List<String> sl = new java.util.ArrayList<String>();
		sl.add("cat");
		sl.add("MAT");
		sl.add("GAT");
		sl.add("SAT");
		
		for (String s : sl) {
			System.out.println(s);
		}
		
		sl.remove(2);
		System.out.println("\nAfter Removal");
		for (String s : sl) {
			System.out.println(s);
		}
		
		sl.add(2, "BHOOT");
		
		System.out.println("\nAfter Addition");
		for (String s : sl) {
			System.out.println(s);
		}
		

	}

}
