package interfaces.constantVariables;

public interface GreetingIntf {

	//CONSTANT VARIABLES
	String GREETING = "Greeting from Interface";
//	Every field declaration in the body of an interface is 
//	implicitly public, static, and final.
	
//	Interface variables are static because Java interfaces cannot 
//	be INSTANTIATED in their own right; the value of the variable 
//	must be assigned in a static context in which no instance exists. 
//	The final modifier ensures the value assigned to the interface 
//	variable is a true constant that cannot be re-assigned by program code.

}
