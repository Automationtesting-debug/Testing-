package ArrayProgram;

public class maxNumberFromArrya {

	public static void main(String[] args) {
		int[] no={8,5,6,8,3,1,98};
		int max=0;
		int min=no[0];
		for(int i=0;i<no.length;i++) {
			if(no[i]>max) {
				max=no[i];}
				else if(no[i]<min)	{
					min=no[i];
				}
			}
		
System.out.println(max);
System.out.println(min);
	}

}
