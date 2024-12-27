package stringProgram;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String name="r12$ohi&3₹ni@4";
		String output="";
		for(int i=0;i<name.length();i++) {
			if(Character.isLetter(name.charAt(i))) {
				output=output+name.charAt(i);;}
				else if(Character.isDigit(name.charAt(i))) {
					output=output+name.charAt(i);;}
				else {
					output=output;
			}
		}
System.out.println(output);
	}

}
