package com.sorting.bubblesort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 82, 4, 2, 9, 6, 23, 4, 12, 34, 0, 1 };
		new InsertionSort().sortInInsertionStyle(arr);
	}
	
	private void sortInInsertionStyle(int[] ar){
		
		int temp = 0;
		
		for(int i=1; i<ar.length; i++){
			for(int j=i; j>0; j--){
				if(ar[j]<ar[j-1]){
					temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		
		System.out.println("FINAL : ");
		for(int p:ar){
			System.out.print(p+", ");
		}
	}
}
