
public class static_variable {
	
	static int a =1;
	static int b= 1;
	static int c =1;
	static int d =1;
	
	static {
		
	
		
		//System.out.println(b);} //static blocks can be used to initialize static variable 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        static_variable access = new static_variable();
      int z = access.d;
       System.out.println(z);
		//static int c =1; // static variable cannot be declared locally inside   a instance method 
		//System.out.println(a);
		
	}

}
