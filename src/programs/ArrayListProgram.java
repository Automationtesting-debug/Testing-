package programs;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		//ArrayList is class
		ArrayList<String> a=new ArrayList<String>();
		//add method use to insert value in Array
		a.add("Trisha");
		a.add("Rohini");
		a.add("Sunil");
		a.add("Rohi");
		a.add("Surude");
		//remove value from array
		a.remove(3);
		System.out.println(a);
		System.out.println(a.get(0));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//item present in array list
		System.out.println(a.contains("Trisha"));
		}
			
	}


