package stringProgram;

import java.util.HashMap;

public class occuranceOfVowels {

	public static void main(String[] args) {
		String name="This is a test";
		String input=name.toLowerCase();
		   HashMap<Character,Integer> count=new HashMap<>();
		   String vowel="aeiou";
		   for(char c:input.toCharArray()) {
			   if(vowel.indexOf(c)!=-1) {
			   if(count.containsKey(c)){
			   count.put(c, count.getOrDefault(c, 0)+1);
		   }
			   else {
				   count.put(c,1);
			   }
		   }
		   }
		  for(HashMap.Entry<Character,Integer> entry:count.entrySet()) {
			  
				  System.out.println(entry.getKey()+"="+entry.getValue());
			  }
		  }
	}


