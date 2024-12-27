package programs;

public class StarPattern {

	public static void main(String[] args) {
		int row=4;
for(int i=row;i>=0;i--) {
	for(int j=0;j<=i;j++) {
	System.out.print("*");	
	}
	System.out.println();
}
	}

}
