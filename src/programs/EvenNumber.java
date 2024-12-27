package programs;

public class EvenNumber {

	public static void main(String[] args) {
		int[] numb= {1,2,4,5,6,8,9,123,128};
	 
		for (int i =0;i<numb.length;i++) {
			
			if(numb[i]%2==0) {
				System.out.print(numb[i]);
				System.out.print(",");
			}
		}
		
	}
				
			
		
	
}
