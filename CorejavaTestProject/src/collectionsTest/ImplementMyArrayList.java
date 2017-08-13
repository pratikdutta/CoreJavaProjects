package collectionsTest;

public class ImplementMyArrayList {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		MyArrayList<String> myArlst= new MyArrayList<String>(100);
//		List<String> myArlst = new ArrayList<String>(100);
		String[] animals = {"Tiger", "Dog", "Cat", "Elephant", "Zebra", "Loin"};
		
		for(int i= 0; i<25; i++){
			for (String string : animals) {
				myArlst.add(string);
				if(i==18){
					System.out.println("Data @ " +myArlst.size()+" = " +string);
				}
			}
		}
		
		

		System.out.println("Value @ 110: "+ myArlst.get(109));
		long endingTime = System.currentTimeMillis();
		
		System.out.println("Time Req: "+ (endingTime-starttime));
	}

}
