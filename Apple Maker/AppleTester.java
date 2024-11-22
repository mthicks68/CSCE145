//Written by Micah Hicks

public class AppleTester {

	public static void p(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		//Introduce the User to the apple tester
		p("Welcome to the apple tester");
		
		//Creates the default apple for the first instance of apple
		p("Creating a default apple");
		Apple apple1 = new Apple ();
		p(apple1.toString());

		//Creates the second apple using the inputed values
		p("Creating another apple");
		p("Setting the new apple's values to the following values: Red Delicious, 4.2, 2.21");
		Apple apple2 = new Apple("", 4.2, 2.21);
		p("Printing the new apple's values");
		p(apple2.toString());
		
		//Creates the third apple using the inputed values but uses the default values because the values are invlaid
		p("Creating another default apple");
		p("Then setting the new apple's values to the following invalid values: Fortnite, -24, -2.99");
		Apple apple3 = new Apple("Fortnite", -24, -2.99);
		p("Printing the newest apple's values which should not have changed from the default values)");
		p(apple3.toString());
	
		//Checks if the first apple's properties are equal to the third apples properties 
		p("Checking if the first and last apple  have the same values");
		System.out.println(apple1.equals(apple3));
		
		
	}
}
