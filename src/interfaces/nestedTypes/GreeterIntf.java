package interfaces.nestedTypes;

public interface GreeterIntf {
	
	class GreeterException extends RuntimeException{
		public GreeterException() { super(); }
	}
	
	interface Helper {
		String Greeting = "Greeting from interface";
	}
}
