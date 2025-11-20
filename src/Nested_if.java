

/*
 * Nested if statement mean an if statement inside an if statement 
 * i.e we can place an if statement inside another if statement 
 *
 * if (conditions1){
 *  STATEMENT : Executes when condition1 is true 
 *  if (conditons2) {
 *  STATEMENT : Executes when condition2 is true 
 *  }
 * 
 * }
 * 
 * 
 * 
 * 
 */


public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =9;
		int b=14;
		
		if(a<=10) {
			if (b<12) {
				System.out.println("b is less than 12");
			}
				else {
					
					System.out.println("b failed ");
				}
			
			}
		else {
			
			System.out.println("a failed ");
		}
	
		}

	}


