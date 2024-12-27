package programs;

public class PolidromNumber {

	public static void main(String[] args) {
		int number=1234321;
		int rev=0;
		int m=number;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		
	}
		System.out.println(rev);
		if(m==rev) {
			System.out.println(m +" is plidron");	
			}
			else{System.out.println(m +" is not plidron");
		}	
	}
}
