package ArrayProgram;

import java.util.ArrayList;

public class PositiveNegative {

	public static void main(String[] args) {
		int [] no={8,5,-6,8,3,1,-98,5,-5};
		ArrayList<Integer> Positivenum=new ArrayList<>();
		ArrayList<Integer> negativenum=new ArrayList<>();
for(int n:no) {
	if(n>0) {
		Positivenum.add(n);	
	}
	else if(n<0) {
		negativenum.add(n);
	}
}
System.out.println("positiveno="+Positivenum);
System.out.println("negativeveno="+negativenum);
	}

}
