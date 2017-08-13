package com.sorting.bubblesort;

/**
 * This is a sorting based on both Search and Sort
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 2, 9, 6, 23, 4, 12, 34, 0, 1 };
		new SelectionSort().sortInSelectionStyle(arr);
	}

	private void sortInSelectionStyle(int[] ar) {
		int index = 0;
		int temp = 0;
		System.out.println("ORIGINAL : ");
		for (int p = 0; p < ar.length; p++) {
			System.out.print(ar[p]+", ");
		}
		System.out.println();
		for (int i = 0; i < ar.length - 1; i++) {
			index = i;
			
			// This is the searching part
			for (int j = i + 1; j < ar.length; j++)
				if (ar[j] > ar[index])
					index = j;
			
			//This is the swapping part
			temp = ar[index];
			ar[index] = ar[i];
			ar[i] = temp;

			System.out.println("\nSWAP # "+i+", Swapping: "+ar[index]+" & "+ar[i]);
			for (int p = 0; p < ar.length; p++) {
				System.out.print(ar[p]+", ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("FINAL : ");
		for (int p = 0; p < ar.length; p++) {
			System.out.print(ar[p]+", ");
		}
	}

}
