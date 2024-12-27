package ArrayProgram;

import java.util.HashSet;

public class DupicateStringfromArray {

	public static void main(String[] args) {
		String[] name= {"Rohini","Trisha","Sunil","Trisha"};
		
		HashSet<String> unique=new HashSet<>();
		HashSet<String> duplicate=new HashSet<>();
		for(String s:name) {
			if(!unique.add(s)) {
				duplicate.add(s);
			}
		}
		for(String s:duplicate) {
			System.out.print(s+",");
		}
	}

}
