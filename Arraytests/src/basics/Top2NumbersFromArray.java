package basics;

public class Top2NumbersFromArray {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int[] a = {5,34,78,2,45,1,99,23, 4, 9, 0, 5, 4, 86, 46, 2, 348, 76};
		Top2NumbersFromArray nums = new Top2NumbersFromArray();
		int[] otpt = nums.get2Numbers(a);
		for(int aq : otpt){
			System.out.println("Num: "+aq);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Time for fetching: "+(t2-t1));
	}
	
	private int[] get2Numbers(int []a){
//		long t1 = System.currentTimeMillis();
		int highest = a[0];
		int secondHighest = 0;
		for(int i =0; i< a.length; i++){
			if(a[i] > highest){
				secondHighest = highest;
				highest = a[i];
			}
			if(a[i] > secondHighest &&  a[i]< highest ){
				secondHighest = a[i];
			}
			
/*			System.out.println("Highest: " + highest);
			System.out.println("Second Highest: " + secondHighest);*/
		}
		int[] q = {highest, secondHighest};
/*		long t2 = System.currentTimeMillis();
		System.out.println("Time for fetching: "+(t2-t1));*/
		
		return q;
	}

}
