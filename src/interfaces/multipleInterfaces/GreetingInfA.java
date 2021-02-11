package interfaces.multipleInterfaces;

public interface GreetingInfA {
	default void greet() {System.out.println("Greeting from GreetingInfA");}
}
