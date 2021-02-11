package interfaces.multipleInterfaces;

public interface GreetingInfB {
	default void greet() { System.out.println("Greeting from GreetingInfB"); }
}
