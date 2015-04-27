package ma.java.scjp.test.flowcontrol.exception.assertion;

public class SwitchTest {

	public static void main(String[] args) {
		String color = new String("Yellow");// or "Yellow"; remember string is Immutable
		
		switch(color){	// color should be constant and can be :int, short, byte, char or enum 
		
			case "Green"	: System.out.println("It's green!"); break;
			case "Pink"		: System.out.println("It's pink!"); break;
			case "Yellow"	: System.out.println("It's yellow!");
			//If default is somewhere above Yellow case it will not be executed ! even that Yellow case
			//has not a break statement
			default : System.out.println("Sorry, it's not a color!"); 	
			
		}
	}
}
