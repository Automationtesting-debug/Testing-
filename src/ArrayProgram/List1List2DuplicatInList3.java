package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1List2DuplicatInList3 {

	public static void main(String[] args) {
		 List<String> L1=Arrays.asList("India","China","Bangladesh");
         List<String>L2=Arrays.asList("shrilanka","India","China");
         List<String>L3=new ArrayList<>();
         for(String Contry:L1)
         {
        	 if(L2.contains(Contry)) {
        		 L3.add(Contry);
        	 }
         }
System.out.println(L3);
	}

}
