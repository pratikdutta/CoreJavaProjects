package com.sorting.bubblesort;

public class QuickSort  {
    private int[] numbers = { 82, 4, 2, 9, 6, 23, 4, 12, 34, 0, 1 };
    private int number;
    
    public static void main(String[] args) {
    	new QuickSort().sort();
	}

    public void sort() {
            number = numbers.length;
            quicksort(0, number - 1);
            for(int p=0; p<number; p++){
            	System.out.print(numbers[p]+", ");
            }
    }

    private void quicksort(int low, int high) {
            int i = low, j = high;
            // Get the pivot element from the middle of the list
            int pivot = numbers[low + (high-low)/2];

            // Divide into two lists
            while (i <= j) {
                    // If the current value from the left list is smaller than the pivot
                    // element then get the next element from the left list
                    while (numbers[i] < pivot) {
                            i++;
                    }
                    // If the current value from the right list is larger than the pivot
                    // element then get the next element from the right list
                    while (numbers[j] > pivot) {
                            j--;
                    }

                    // If we have found a value in the left list which is larger than
                    // the pivot element and if we have found a value in the right list
                    // which is smaller than the pivot element then we exchange the
                    // values.
                    // As we are done we can increase i and j
                    if (i <= j) {
                            exchange(i, j);
                            i++;
                            j--;
                    }
            }
            // Recursion
            if (low < j)
                    quicksort(low, j);
            if (i < high)
                    quicksort(i, high);
    }

    private void exchange(int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
    }
}