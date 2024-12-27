package stringProgram;

import java.util.HashMap;

public class NumberofChracters {
	public static void main(String[] args) {
		 String name="Rohini ghule";
		String n=name.replace(" ", "").toLowerCase();
		 System.out.println(n);
		 HashMap<Character,Integer> count=new HashMap<>();
		 for(char c:n.toCharArray()) {
		count.put(c,count.getOrDefault(c, 0)+1);	 
		 }
		 for(char i:count.keySet()) {
			 System.out.println(i+"="+count.get(i));
		 }
	}
}
