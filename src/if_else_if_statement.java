


/*
 * it is conditional controlling the if is true ,the statement associated with that "IF" executed & rest of the ladder is by passed
 * if none of the conditonis ture then the final else statement will be executed 
 * 
 * SYNTAX :
 * 
 * IF (CONDITION){
 * 
 * CODE to be exectured if conditions is true 
 * }
 * ELSE IF (CONDITION 2){
 * 
 * code to be executed if condition 2 is true 
 * }
 * ELSE {
 * 
 * code to be executed if all condition is false
 * 
 * }
 * 
 * 
 * 
 * 
 */
public class if_else_if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int b =1000;
		
		if (b<10) {
			
			System.out.print("b is lesse than 10");
			
			
		}
		
		else if (b>10&b<199) {
			System.out.print("b is greater than 10");
		}
		
		else {
			System.out.println("b neither less and neither greater than 199");
		}
		

	}

}
