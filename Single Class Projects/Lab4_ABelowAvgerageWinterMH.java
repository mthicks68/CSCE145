//Micah Hicks
//I need to take 10 numbers of tempature from a user input, put them in a array, and gives the average of all of them with the days that were below the Average
import java.util.Scanner;

public class Lab4_ABelowAvgerageWinterMH {

	public static void main(String[] args) {
		//Creates the scanner used to take in the user inputs
		Scanner k = new Scanner(System.in);
		
		//Creates an array with a length of 10 for each of the 10 days.
		//Store values in the decimals as doubles used especially for average later
		double[] temperatures = new double[10];
		
		//Introduces the player to the purpose of the program
		System.out.println("Welcome to the below average temperature tester program.");
		
		//Asks the temperature for each day and stores it using the for loop.
		//Assigns the temperature for each day to the correct index relating to each day
		
		for(int i = 0; i < temperatures.length; i++)
		{
			System.out.println("Please enter the temperature for day " + (i+1));
			//Grabs the temperature entered for the specific day ands stores it in the correct index
			temperatures[i] = k.nextDouble();
		}
		
		//Creates the variable double to store the value of the sum of all the temperatures
		double s = 0;
		
		//Goes through the entire array adding the temperature of the previous day to the sum of all the temperatures
		for(int i = 0; i < temperatures.length; i++)
		{
			s += temperatures[i];
			
		}
		
		//Creates a variable to store the sum (s) of all the temperatures divided by the number of days
		double avgTemp = s/temperatures.length;
		
		//Prints out the average temperature of all the days and the introduction to which days were below the average.
		System.out.println("The average temperature was " + avgTemp);
		System.out.println("The days that were below average were:");
		
		//Goes through each days temperature and compares it the average temperature and prints it if it's lower than the average.
		for(int i = 0; i < temperatures.length; i++)
		{
			if(temperatures[i] < avgTemp)
			{
				System.out.println("Day " + i+1 + " with " + temperatures[i]);
			}
		}
		
	}

}

