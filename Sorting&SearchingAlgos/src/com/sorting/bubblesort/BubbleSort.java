package com.sorting.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {82, 4, 2, 9, 6, 23, 4, 12, 34, 0, 1};
		new BubbleSort().sortInBubbleStyle(arr);
	}
	
	private void sortInBubbleStyle(int[] ar){
		int temp = 0;
		for(int m=0; m<ar.length; m++){
			for(int n=1; n<ar.length-m; n++){
				if(ar[n-1]>ar[n]){
					temp = ar[n-1];
					ar[n-1] = ar[n];
					ar[n] = temp;
				}
				for(int k = 0; k<ar.length; k++){
					System.out.print(ar[k]+", ");
				}
				System.out.println();
			}
		}
		System.out.println("FINAL : ");
		for(int k = 0; k<ar.length; k++){
			System.out.print(ar[k]+", ");
		}
	}

}
