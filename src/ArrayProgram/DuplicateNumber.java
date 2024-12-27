package ArrayProgram;

import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
	int [] no={8,5,6,8,3,1,98,5,5};
	HashSet<Integer> dup=new HashSet<>();
	HashSet<Integer> uni=new HashSet<>();

for(int num:no) {
	if(!uni.add(num)) {
		dup.add(num);
}

	}
	for(int n:dup) {
		System.out.print(n+" ");
	}
	}	

}
