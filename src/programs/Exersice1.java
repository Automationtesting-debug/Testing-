package programs;

public class Exersice1 {

	public static void main(String[] args) {

		int[] numbers={1,2,4,5,6};
	    int count=0;
	    System.out.print("reverse order:");
	    for(int i=numbers.length-1;i>=0;i--){
	        count++;
	        
	        System.out.print(+numbers[i]+",");
	        
	    }
	    System.out.println();
	     System.out.println("count:"+count);
	     System.out.println("The first element of the numbers array:"+numbers[0]);
	     System.out.println("The last element of the numbers array:"+numbers[count-1]);
	}
	}


