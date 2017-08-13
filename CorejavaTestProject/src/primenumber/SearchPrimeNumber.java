package primenumber;

public class SearchPrimeNumber {

	public static void main(String[] args) {
		int upto = 20000;
		SearchPrimeNumber spn = new SearchPrimeNumber();
		System.out.println("Program execution started. \n Calculating...");
		long t1 = System.currentTimeMillis();
		int []sr = spn.primeNumbers(upto);
		long t2 = System.currentTimeMillis();
		System.out.println("Time Required for calculating Prime Numbers upto "+ upto + " is :  "+ (t2-t1)+" milliseconds.");
		/*for(int l : sr){
			if(l != 0){
				System.out.println(l);
			}
		}*/
	}
	
	private int[] primeNumbers(int upto){
		int [] prms = new int[5000];
		boolean primeFlag = false;
		int cnt = 3;
		prms[0] = 1;
		prms[1] = 2;
		prms[2] = 3;
		for(int k = 4; k< upto; k++){
			if(k % 2 == 0 ||k% 3 == 0){
				continue;
			}else {
				for(int p = 3; p <= k; p++){
					if(k%p == 0){
						if(k==p){
//							primeFlag = true;
							prms[cnt] = k;
							cnt++;
						}
						break;
					}
				}
				if(!primeFlag){
					continue;
				}else{
				prms[cnt] = k;
				cnt++;
			}
			}
		}
		
		return prms;
	}

}
