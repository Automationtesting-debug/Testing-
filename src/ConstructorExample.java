
 class ConstructorExample {
	int a;
	
	ConstructorExample (){
		System.out.println("default constructor");
	}
	ConstructorExample (int value){
		a=value;
		System.out.println("parametrized consructor");
	}
	ConstructorExample (ConstructorExample  obj){
		a=obj.a;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorExample ob =new ConstructorExample (); 
		ConstructorExample b=new ConstructorExample (10);
		ConstructorExample c=new ConstructorExample (b);
	System.out.println(c.a);
	}

}
