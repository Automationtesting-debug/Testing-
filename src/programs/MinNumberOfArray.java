package programs;

public class MinNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] no= {11,230,32,49,4,550,17};
		int min=no[0];
		
		for(int i=1;i<no.length;i++) {
				if(no[i]<min) {
					min=no[i];
				}
				}
System.out.println(min);
	}
	
	
}
