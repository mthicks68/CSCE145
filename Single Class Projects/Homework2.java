//Micah Hicks
//I need to write a program that takes two four digit binary numbers, 
//converts them to decimal values, adds them together and prints the decimal values and the addition of them together
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		//Sets up Scanner to grab user input
		Scanner k = new Scanner(System.in);

		//Asks user for 4 bit binary number and stores input as binary1
		System.out.println("Please input a 4 bit binary number: ");
		String binary1 = k.next();

		//Asks user for another 4 bit binary number and stores input as binary2
		System.out.println("Please input another 4 bit binary number: ");
		String binary2 = k.next();

		//Integers to store the decimal numbers converted from the binary number
		//b = binary and D = decimal 
		int bToD1 = 0;
		int bToD2 = 0;

		//I do not know a more efficient way of doing this but this checks the value of each number of the string
		//If the condition is true than it adds that value to the integer that stores the decimal value
		//These if statements check the first binary number and converts it to decimal
		if (binary1.charAt(0) == '1')
		{
			bToD1 += 8;
		}
		if (binary1.charAt(1) == '1')
		{
			bToD1 += 4;
		}
		if (binary1.charAt(2) == '1')
		{
			bToD1 += 2;
		}
		if (binary1.charAt(3) == '1')
		{
			bToD1 += 1;
		}

		//These are the second group of if statements that check and convert the second binary number to decimal
		if (binary2.charAt(0) == '1')
		{
			bToD2 += 8;
		}
		if (binary2.charAt(1) == '1')
		{
			bToD2 += 4;
		}
		if (binary2.charAt(2) == '1')
		{
			bToD2 += 2;
		}
		if (binary2.charAt(3) == '1')
		{
			bToD2 += 1;
		}

		//Prints out both numbers converted from binary and the sum of the two binary numbers in decimal. 
		System.out.println("The first number is " + bToD1);
		System.out.println("The second number is " + bToD2);
		System.out.println("The sum of the two numbers is " + (bToD1 + bToD2));
	}

}