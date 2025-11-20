
public class Variable_in_Java {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Variable it is named storage location that hold a value ,which can be modified during program execution and it is associated with specific data type 
		 * data type :- it refers to the different sizes and values that can be store in the variable 
		 * int a =1
		 * integer > its data type 
		 * a :- it is variable 
		 * 1 the value against the variable 
		 * 
		 * there are three types of variable 
		 * 
		 * local variable : it is variable defined within block ,method and constructor,the scope of variable exist within block and initialization of the local variable is mandatory 
		 * before using its is the defined scope
		 * 
		 * instance variable :-these are non static variable and are declared in class and outside method /constructor/ block, they are access specifier for instance variable,
		 * initialization of an instance variable is not mandatory,scope of instance variable are throughout the class except the static content ,instance variable can be accessed
		 * only by creating object,we initial instance variable using constructor while creating an object /we can you use instance block  to initialize 
		 * 
		 *  
		 * static variable :- it is also known as class variables ,it is declared using the static keywords within a class outside of any method /constructor/block
		 * it is only  one copy of static  of static variable per class  irrespective of how many object created
		 * it is created at start of program and execution & destroyed when execution ends 
		 * initialization of static variable is not mandatory ,
		 * its default value is dependent on the data type of variable 
		 * if we access a static variable like an instance variable ,the complier will show a warning message which won't halt program ,the compiler will replace the object name with call name automaticcally 
		 * if we access a static variable without  a class name ,the compiler will automatically append the class name ,but for accessing the static variable of different class 
		 * we must mention the class name as 2 different class might have  a static variable with  a same name 
		 * static variable cannot be declared locally inside   a instance method 
		 * static blocks can be used to initialize static variable 
		 * 
		 * 
		 * */

		int a = 10;
		
		System.out.print(a);
		
		
		
		
	}

	 
		
	
	
}
