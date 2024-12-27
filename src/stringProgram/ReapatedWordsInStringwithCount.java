package stringProgram;

import java.util.HashMap;

public class ReapatedWordsInStringwithCount {
	 public static void main(String[] args) {
		   String input="This is a test for a java proggraming for a specified program";
		   String[] words=input.split(" ");
		   HashMap<String,Integer> wordcount=new HashMap<>();
		   for(String w:words) {
			   wordcount.put(w,wordcount.getOrDefault(w, 0)+1);
		   }
		   for(HashMap.Entry<String,Integer>entry:wordcount.entrySet()) {
			   if(entry.getValue()>1){
				   System.out.println(entry.getKey()+":"+entry.getValue());
			   }  
		   }
	 } 

}
