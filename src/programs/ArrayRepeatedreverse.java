package programs;

public class ArrayRepeatedreverse {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,3,2,5};
	     //expected 5 3 2
	     
	 
	 
	             for (int i=numbers.length;i>=0;i--){
	    	         
	    	         for(int j=i+1;j<numbers.length;j++){
	    	         if(numbers[i]==numbers[j]){
	    	             System.out.print(numbers[i]);

	         }	}

}
}
}