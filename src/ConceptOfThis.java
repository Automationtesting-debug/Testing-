
public class ConceptOfThis {
	int a,b,c;
	ConceptOfThis(){
		this(10,20);
		System.out.println("default");
	}
	ConceptOfThis(int x,int y){
		this(3,4,5);
		System.out.println("2 para");
	}
	ConceptOfThis(int a,int b,int c){
		this.a=a;
		this.b=b;
				this.c=c;
		
		System.out.println("3 para");
	}
	public static void main(String[] args) {
		ConceptOfThis con=new ConceptOfThis(10,20);

	}

}
