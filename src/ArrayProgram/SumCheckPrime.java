package ArrayProgram;

public class SumCheckPrime {

	public static void main(String[] args) {
		  int[] numbers = {3, 1, 2, 5};
int sum=0;

for(int i=0;i<numbers.length;i++) {
	sum=sum+numbers[i];
}
System.out.println("sum of numbers in arrya="+sum);
	if(sum==0||sum==1) {
		System.out.println("sum is not prime");
	}
	for(int i=2;i<sum/2;i++) {
		if(sum%i==0) {
			System.out.println("sum is not prime");
			break;
		}
		else {
			System.out.println("sum is prime");
			break;
		}
	}
	}

}
