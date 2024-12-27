package stringProgram;

import java.util.HashMap;

public class CountOfVowelsConsonant {
	 public static void main(String[] args) {
	// Define the input string
    String n="rohini";
    int v=0;
    int c=0;
    for(int i=0;i<n.length();i++){
    if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'
    ||n.charAt(i)=='o'||n.charAt(i)=='u'){
    v++;

    }
    else{c++;
    }
}
System.out.println("vcount= "+v);
System.out.println("Ccount= "+c);
	}}

