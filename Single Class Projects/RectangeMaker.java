//Written by Micah Hicks
import java.util.Scanner;

public class RectangeMaker {

	public static void p(String aS) {
		System.out.println(aS);
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		//Creating the Rectangle arrays
		p("Welcome to the Rectangle Sorter!");
		p("Please input the number of rectangles you want in the collection");

		int s = 0;

		//Setting the value of how many rectangles the user wants and checking if its a valid amount of rectangles. 
		s = k.nextInt();
		while(s <= 0) {
			p("Please enter in a valid amount of rectangles");
			s=k.nextInt();
		}

		double[][] rS = new double[s][2];
		double[] rA = new double[s];
		for(int i = 0; i < s; i++) 
		{
			p("Please enter in the length and width of rectangle " + (i+1));
			//Grabs the length and width of each rectangle to set the value input at the correct index of the multidimensional area.
			for(int j = 0; j < 2; j++) 
			{
				rS[i][j] = k.nextDouble();
			}
			rA[i] = (rS[i][0] * rS[i][1]);
		}

		for (int i = 0; i < rA.length; i++)
		{
			p(rA[i] + ", ");
		}

		while(s!= 0)
		{
			String userChoice = k.nextLine();
				
			if(userChoice.equals("Find Average Area")) 
			{
				//Average of rectangle area and used floats to display correct average area. 
				float sumOfRectangleAreas = 0;
				for(int i = 0; i < s; i++) {
					sumOfRectangleAreas = sumOfRectangleAreas += rA[i]; 
				}
				float averageArea = (sumOfRectangleAreas/s);
				p("The average area is " + averageArea);
			}

			if(userChoice.equals("Find Min Area")) 
			{
				//Minimum Area of Rectangle
				double minArea = rA[0];
				for(int i = 0; i < s; i++)
				{
					if(minArea > rA[i]) {
						minArea = rA[i];
					}
				}
				p("The minimum area is " + minArea);
			}

			if(userChoice.equals("Find Max Area")) 
			{
				//Maximum area
				double maxArea = rA[0];
				for(int i = 0; i < s; i++)
				{
					if(maxArea < rA[i]) {
						maxArea = rA[i];
					}
				}
				p("The Maximum area is " + maxArea);
			}
			
			if(userChoice.equals("Sort Rectangle Area Small to Large")) 
			{
				boolean hasSwapped = false;

				do
				{
					hasSwapped = false;
					//Checks if a value is less than the next value and if it is it swaps the values of the two areas. 
					for(int i = 0; i < rA.length - 1; i++)
					{
						//comparing i to i+1
						if(rA[i] > rA[i+1])
						{
							hasSwapped = true;
							int temp = (int) rA[i];
							rA[i] = rA[i+1];
							rA[i+1] = temp;
						}
					}
					
				}while(hasSwapped);
			
				System.out.println("Sorted List: ");
				//Prints out the sorted areas list
				for(int i = 0; i < rA.length; i++)
				{
					System.out.print(rA[i] + " ");
				}
			}
			
			if(userChoice.equals("Sort Rectangle Area Large to Small")) 
			{
				boolean hasSwapped = false;

				do
				{
					hasSwapped = false;
					//Now swaps if the values are less than the next one. 
					for(int i = 0; i < rA.length - 1; i++)
					{
						//comparing i to i+1
						if(rA[i] < rA[i+1])
						{
							hasSwapped = true;
							int temp = (int) rA[i];
							rA[i] = rA[i+1];
							rA[i+1] = temp;
						}
					}
					
				}while(hasSwapped);
				System.out.println("Sorted List: ");
				
				for(int i = 0; i < rA.length; i++)
				{
					System.out.print(rA[i] + " ");
				}
			}
			p("Please type what you want to do with the collection: Find Average Area, Find Min Area, Find Max Area, Sort Rectangle Area Small to Large, Sort Rectangle Area Large to Small");
		} 
	} 
}

