package interfaces.multipleInterfaces;

public class MyGreeter implements GreetingInfA, GreetingInfB{
	@Override
	public void greet() {
		GreetingInfA.super.greet();
	}
}
