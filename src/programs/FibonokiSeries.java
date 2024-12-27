package programs;

public class FibonokiSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13...
	int num=4;	
int n1=0;
int n2=1;
System.out.print(n1+","+n2+",");

for(int n=0;n<=10;n++) {

		n=n1+n2;
		n1=n2;
		n2=n;	
		System.out.print(n+",");
		
		if(num==n) {
			System.out.println("numb belongs to fibonoci series");
		}
}	
}
	}

