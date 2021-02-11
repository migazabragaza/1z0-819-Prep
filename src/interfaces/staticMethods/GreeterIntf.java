package interfaces.staticMethods;

public interface GreeterIntf {
	static void greet() {
	
//		A static method cannot be overridden or changed in the 
//		implementation class.
//
//		A static method cannot be shadowed too, as it part of the 
//		interface, not part of implementing the class.
	
		System.out.println("Greeting from GreeterIntf");
	}
}
