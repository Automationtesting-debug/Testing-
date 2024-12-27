package stringProgram;

public class LowerToUpperUpperToLowerCase {

	public static void main(String[] args) {
		String name="Rohini";
		String y="";
		for(int i=0;i<name.length();i++) {
			if(Character.isLowerCase(name.charAt(i))) {
			y=y+Character.toUpperCase(name.charAt(i));	
			}
			else	if(Character.isUpperCase(name.charAt(i))) {
				y=y+Character.toLowerCase(name.charAt(i));	
		}
		}
System.out.println(y);
	}

}
