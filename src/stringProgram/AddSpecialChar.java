package stringProgram;

public class AddSpecialChar {

	public static void main(String[] args) {
		String name="Rohini sunil surude";
		String SpecChar="@#$";
		String []n=name.split(" ");
		String[] s=SpecChar.split("");
		String Output="";
		
		for(int i=0;i<n.length;i++)
		{
			Output=n[i]+s[i];
			System.out.print(Output);
		}

	}

}
