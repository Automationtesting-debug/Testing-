package programs;

import java.util.Arrays;

public class Assendingorderarray {
	 public static void main(String[] args) {
	        // Example array
	        int[] numbers = {45, 12, 89, 7, 23, 56, 1};

	        // Sort the array using Bubble Sort
	        bubbleSort(numbers);

	        // Print the sorted array
	        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
	    }

	    // Function to perform Bubble Sort
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

}
