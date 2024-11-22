//Written by Micah Hicks
//Want to create a triangle of astricks in the console
//Based on the size the user inputs.

//Import the scanner code from java										(Done)
import java.util.Scanner;
public class Lab3_TriangleMaker {

	public static void main(String[] args) {
		//Introduces the reader to the purpose of the program and asks for the inputed size of the triangle the user wants
		System.out.println("Welcome to the Triangle Maker! Enter the size of you triangle - ");		
		//Creates a scanner to grab the inputed size of the triangle from the user
		Scanner keyboard = new Scanner(System.in);
		//Creates an integer to store the inputed size of triangle from the user
		int size = keyboard.nextInt();
		//Used to create the first half of the triangle by nesting a for loop in another.
		//First for loop runs the code inside to format each layer and creating the next line to put the next layer of the triangle
		for (int i = 0; i <= size; i++)
		{
			//Creates each layer of the triangle by printing asterisks to the size of the triangle.
			//It does this thorough printing the number of asterisks equal to i through checking if the j is less than i.
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		for (int i = size; i >= 0; i--)
		{
			for(int j = 0; j < i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		if (size <= 0)
		{
		System.out.println("Invalid Input!");
		}
		else
		{
			System.out.println("Done!");
		}
		
	}
}
