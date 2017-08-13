package collectionsTest;

public class ImplementMyLinkedList {

	public static void main(String[] args) {
		MyList<String> ml = new MyLinkedList<String>();
		
		ml.add("Cat");
		ml.add("Cow");
		ml.add("Goat");
		ml.add("Crow");
		ml.add("Rat");
		ml.add("Dog");
		ml.add("Sparrow");
		ml.add("Mouse");
		
		System.out.println("Size: " + ml.size());
		
		System.out.println("Data @ 5 : "+ ml.get(4));
		

	}

}
