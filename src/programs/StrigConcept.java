package programs;

import java.util.Arrays;
import java.util.List;

public class StrigConcept {

	public static void main(String[] args) {
		// String is an object which represent sequence of characters
		//2 way to declare string
		//1. String Literal
		String a="Rohini";
		String b="Rohini";
//only single object has been created if object having same value
		//2. String with new Key word
				String c=new String("Rohini");
				String d=new String("Rohini");
//multiple object has been created if object having same value
	
		//Split String 		
        String Name="Trisha Sunil Surude";
		String[] splitedName=Name.split(" ");
		List<String> ListOfsplitedName=Arrays.asList(splitedName);
	System.out.println("SplitedstingList:"+ListOfsplitedName);
		//enhanced for loop
	System.out.println("Trimed Value----");
		for(String val:splitedName) {
	//Trim is used to remove white space before and after string 
		
		System.out.println(val.trim()+",");
		
		String Trimname=val.trim();
		}
		
		//character of string 
		System.out.println("Charachers in Name----");
		int count=0;
				for(int i=0;i<ListOfsplitedName.size();i++) {
					
					String S=ListOfsplitedName.get(i);
					
					for(int j=0;j<S.length();j++) {
						count++;
						System.out.print(S.charAt(j)+",");
	
		}
				
	}
				System.out.println();
				System.out.print("Numbers of Chracters in Name="+count);

	}
	}

