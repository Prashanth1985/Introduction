
public class forloop_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11,12,13,14,15,16,17,18,19,20};
		
		for (int i=0;i<a.length;i++) {
			
			if(i%2!=0) {
				
				System.out.print("print even number"+a[i]);
			//	continue;  continue the loop even after conditon is met 
			//	break :exist the loop  after condition is met
	    		
				
				
			}
			
			else { System.out.println("print odd number"+a[i]);}
		}
		
		
	}

}