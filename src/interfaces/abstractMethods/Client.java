package interfaces.abstractMethods;

public class Client {
	public static void main(String[] args) {
		GreeterIntf greeter = () -> {
			System.out.println("Greeting from interface");
		};
		greeter.greet();
	}
}
