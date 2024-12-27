package ArrayProgram;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		int [] array= {11,230,32,49,4,550,17};
		
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
        System.out.println();
        int count=1;
            int thirdMax=1;
            for (int i = 1; i < array.length - 1; i++) {
            	if(array[i]!=array[i-1]) {
            		count++;
            	}
            	if(count==2) {
            		thirdMax=array[i];
            		break;
            	}
            	
            }
            System.out.println(thirdMax); 
        }
       
	}



