/*
 * JUMP STATEMENT 
 * 
 * SWITCH CASE : It is multi-way branch statement 
 * it provides an easy way to dispatch execution to different parts of code based on the value of expression 
 * 
 * SYNTAX : SWITCH (expression)
 * case value1 ;
 * 
 * CODE to be executed if expression = value1
 * 
 * 
 * case value2 ;
 * CODE to be executed if expression = value 2
 * 
 * 
 * case value 3;
 * CODE to be executed if expresssion = value 3
 * 
 * 
 * default ;
 * code to be executed if no cases such 
 * 
 * 
 * BREAK KEYWORD :- the break statement is used inside the switch to terminate a statement sequence or to exit loop
 * CONTINUE KEYWORD :- it is useful to force an early iteration of loop
 *RETURN KEYWORD :- the return statement is used to explicit return from a method  ,it causes program control to transfer back to called of the method 
 *
 *
 * 
 */



public class JUMP_STATEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mohan";
		
		switch(a){
			
		case "Test":System.out.print("Test");
		break;
		case "test":System.out.print("test");
		break;
		default : System.out.print("none of them matched");
		
			
		}
		
	}

}
