package basics;

public class TwoMaxNumbers {
	 
    public void printTwoMaxNumbers(int[] nums){
    	
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]){
    	
    	long t1 = System.currentTimeMillis();
        int num[] = {5,34,78,2,45,1,99,23, 4, 9, 0, 5, 4, 86, 46, 2, 348, 76};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
        
		long t2 = System.currentTimeMillis();
		System.out.println("Time for fetching: "+(t2-t1));
    }
}
