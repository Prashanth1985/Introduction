
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	/* Array : it is fundamental structure in java that allow us to store multiple values of the same type in single variable 
	 * Eg : int[] a = {1,2,3,4,5};
	 * eg below 
	 * it can be declared in two types 
	 * System.out.println(array.lenght);
	 * System.out.println(array[according to index value 0]);
	 * 
	 * SYNTAX : 
	 * 
	 * TYPE[] ARRAYNAME
	 * TYPE : The datatype of the array element ie int ,string
	 * arrayname = the name of array
	 * 
	 * Accessing the first element of the array 
	 * int [] array = number [0];
	 * 
	 * 
	 * Setting the first element of the array 
	 * number[0]=10;
	 * 
	 * To change element assign a new value to specific index
	 * number[0]= 20;
	 * 
	 * We can get the length of an array using the length property 
	 * 
	 *int.length = number.length
	 *
	 * 
	 *  
	 */
		int[] array = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		
		for (int value:array)
		System.out.print(value);
		
		System.out.print(" ");
		//or
		
		int[] arraytwo = {0,1,2,3,4};
		for (int i=0;i<arraytwo.length;i++)
		System.out.print("\b"+""+i);
	
		
	}

}
