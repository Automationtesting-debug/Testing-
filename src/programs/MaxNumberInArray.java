package programs;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int [] no= {11,230,32,49,4,550,17};
		int max=0;
		
		for(int i=0;i<no.length;i++) {
				if(no[i]>max) {
					max=no[i];
				}
				}
System.out.println(max);
	}

}
