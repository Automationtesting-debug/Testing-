package programs;

public class ReverseIntegers {

	public static void main(String[] args) {
		int num =12321;
		int rev=0;
		int m=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==m) {
			System.out.println("num is polidrom");
	
		}
		else  {
			System.out.println("num is not  polidrom");
	}
		}
}
