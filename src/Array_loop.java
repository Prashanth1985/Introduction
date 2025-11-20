
public class Array_loop {
	
	
	//The string with array can also be iterated when declaration in for loop specifically
	//FOR loop syntax  : for (int i = 0; i< variable/object;i++)
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 int[] array = {1,2,3,4,5,6};
	
	for(int i=0;i<array.length;i++) {
		//System.out.print(array[i]);
	}
	
	for(int a:array){
	System.out.print(a);
	}
	
	String[] name = {"anil","akash","aditya","avinash"};
	

	for(int j=0;j<name.length;j++) {
		System.out.print(name[j]);
		System.out.print(" ");
	}
	
	
}
}