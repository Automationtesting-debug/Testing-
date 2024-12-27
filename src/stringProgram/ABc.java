package stringProgram;

import java.util.HashMap;

public class ABc {

	public static void main(String[] args) {
		 // Sample array
        int[] array = {12, 4, 56, 23, 78, 1, 45};

        int[] no={12, 4, 56, 23, 78, 1, 45};
		

        // Sort the array in descending order using loops
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        
        for (int num : array) {
            System.out.print(num + " ");
        }
    
	}


}
