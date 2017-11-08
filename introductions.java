import java.io.Console;

public class Introductions {
	public static void main(String[] args) {
		Console console = System.console();
		String firstName = "Tina";
		// Welcome to the Introductions program! Your code goes below here
		console.printf("Hello, my name is %s \n", firstName);
		console.printf("%s is learning how to write Java\n", firstName);
	}
}