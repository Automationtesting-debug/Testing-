
package programs;

public class ReverseString {

	public static void main(String[] args) {
		String name="Rohini";
		String rev=" ";
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.print(rev);

	}

}