package interfaces.abstractMethods;

public interface GreeterIntf {
//	Every method declaration in an interface with body represented 
//	by a semicolon is implicitly public and abstract.
	
	void greet();
	
//	private abstract void greet();
//	static abstract void greet();
//	final abstract void greet();
//	native abstract void greet();
//	strictfp abstract void greet();
//	synchronized abstract void greet();
	
//	It would be impossible for a class to implement a 
//	private abstract method, because private methods are 
//	not inherited by subclasses; therefore such a method 
//    could never be used.
}
