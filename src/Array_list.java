import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_list {
	
/*	An ArrayList is like a resizable array.

	It is part of the java.util package and implements the List interface.

	The difference between a built-in array and an ArrayList
	in Java, is that the size of an array cannot be modified
	(if you want to add or remove elements to/from an array, you have to create a new one).
	While elements can be added and removed from an ArrayList whenever you want
	
	it will help expanding with dynamic value in it 
	the demerit of array ,it is initialized with fixed size 
	
	Syntax
	
	ArrayList a =  new ArrayList();
	ArrayList is class of the object
	a is object name 
	new is operator 
	Arraylist is object 
	
	*/

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//example
		
		ArrayList<Integer> a =  new ArrayList<Integer>();
		a.addAll(Arrays.asList(1, 2, 3, 4, 5));
		
		
		
		System.out.println(a);

	}

}
