package todo.singleton;

//Create the FIT_Test for testing purpose
public class FIT_Test {
	// TO-DO: Implement the main() method
	public static void main(String args[]) {
		// Create 2 new instances (objects) by calling getInstance() method
		FIT firstFit = FIT.getInstance();
		FIT secondFit = FIT.getInstance();

		// With 1st instance, display given text in upper case
		System.out.println(firstFit.toUpper());

		// With 2nd instance, display given text in lower case
		System.out.println(secondFit.toLower());

	}
}
