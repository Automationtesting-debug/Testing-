package stringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Xyz {

		 public static void main(String[] args) {
			 String s="Hello java Hello";

			 HashMap<String ,Integer> count =new HashMap<>();

			 for(String w:s.split(" ")){
			     count.put(w,count.getOrDefault(w,0)+1);
			 }

			 for(HashMap.Entry<String,Integer> entry :count.entrySet()){
			   if(entry.getValue()>1) {
			       System.out.println(entry.getKey()+"="+entry.getValue());
			   } 
			 }
			 }
			 }
  
	    	  
	

