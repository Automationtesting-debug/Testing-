package ArrayProgram;

public class arrayInDecdendingOrder {

	public static void main(String[] args) {
		//
		int[] array={8,5,6,8,3,1,98};
		
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
	}
}