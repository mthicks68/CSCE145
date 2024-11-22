//Micah Hicks
//This code is to determine a zodiac sign based on the users birth month and day

import java.util.Scanner;
public class Lab02_MicahHicks {

	public static void main(String[] args) {
		//Setting up the Scanner to grab the user keyboard inputs to store as birth month and day variables
		Scanner keyboard = new Scanner(System.in);
		//Introduction to the user and asking them to input their birthday month and day
		System.out.println("What is your Zodiac Sign? Enter your birthday --");
		System.out.println("Enter your month followed by the day in numbers");
		//Creating the variables to store the variables 
		//Month (m) and day (d) inputed by the user
		int m = keyboard.nextInt();
		int d = keyboard.nextInt();
		//Checks if the month is a valid month between 1 and 12
		//and returns an invalid input if that is the case
		if (m >= 13 || m <= 0)
		{
			System.out.println("Invalid Month");
		}
		//Checking day in each month to determine which correct Zodiac Sign 
		//to print or if the input data for the day given is invalid
		if (m == 1) 
		{
			if (d <= 19 && d > 0)
			{
				System.out.println("You are a Capricorn!");
			}
			else if (d >= 20 && d <= 31)
			{
				System.out.println("You are an Aquarius!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}
		}
		if (m == 2)
		{
			if (d <= 18 && d > 0)
			{
				System.out.println("You are an Aquarius!");
			}
			else if (d >= 19 && d <= 29)
			{
				System.out.println("You are a Pisces!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}
		}
		if (m == 3)
		{
			if (d <= 20 && d > 0)
			{
				System.out.println("You are a Pisces!");
			}
			else if (d >= 21 && d <= 31)
			{
				System.out.println("You are an Aries!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}
		}
		if (m == 4)
		{
			if (d <= 19 && d > 0)
			{
				System.out.println("You are an Aries!");
			}
			else if (d >= 20 && d <= 30)
			{
				System.out.println("You are a Taurus!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 5)
		{
			if (d <= 20 && d > 0)
			{
				System.out.println("You are a Taurus!");
			}
			else if (d >= 21 && d <= 31)
			{
				System.out.println("You are a Gemini!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 6)
		{
			if (d <= 20 && d > 0)
			{
				System.out.println("You are a Gemini!");
			}
			else if (d >= 21 && d <= 30)
			{
				System.out.println("You are a Cancer!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 7)
		{
			if (d <= 22 && d > 0)
			{
				System.out.println("You are a Cancer!");
			}
			else if (d >= 23 && d <= 31)
			{
				System.out.println("You are a Leo!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 8)
		{
			if (d <= 22 && d > 0)
			{
				System.out.println("You are a Leo!");
			}
			else if (d >= 23 && d <= 31)
			{
				System.out.println("You are a Virgo!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 9)
		{
			if (d <= 22 && d > 0)
			{
				System.out.println("You are a Virgo!");
			}
			else if (d >= 23 && d <= 30)
			{
				System.out.println("You are an Libra!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 10)
		{
			if (d <= 22 && d > 0)
			{
				System.out.println("You are a Libra!");
			}
			else if (d >= 23 && d <= 31)
			{
				System.out.println("You are an Scropio!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 11)
		{
			if (d <= 21 && d > 0)
			{
				System.out.println("You are a Scropio!");
			}
			else if (d >= 22 && d <= 30)
			{
				System.out.println("You are an Sagittarius!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}

		}
		if (m == 12)
		{
			if (d <= 21 && d > 0)
			{
				System.out.println("You are a Sagittarius!");
			}
			else if (d >= 22 && d <= 31)
			{
				System.out.println("You are an Capricorn!");
			}
			else
			{
				System.out.println("Invalid Day!");
			}
		}
	}//End of Main
}
//End of Class