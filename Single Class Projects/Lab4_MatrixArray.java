//Written by Micah Hicks
//I need to add two matrices to get a resulting matrix
import java.util.Scanner;

public class Lab4_MatrixArray {
	
	public static void main(String[] args) {
		
		//Sets up the Scanner to grab the user inputs
		Scanner k = new Scanner(System.in);

		//introduces purpose of program to the user
		System.out.println("Welcome to Matrix Adder Program!");
		
		//Gets the length and width from the user and user those values to form the first multi-deminsional array/matrix
		System.out.println("Please enter in the length and width of the first matrix");
		int[][] matrix1 = new int[k.nextInt()][k.nextInt()];
		
		//Gets the length and width from the user and user those values to form the second multi-deminsional array/matrix
		System.out.println("Please enter in the length and width of the second matrix");
		int[][] matrix2 = new int[k.nextInt()][k.nextInt()];
		
		//Checks if the lengths and widths of the first matrix matches the second matrix
		//If they don't match it prints invalid input and terminates the program
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length)
		{
			System.out.println("Invalid demonsions, these cannot be added!");
			return;
		}
		
		//Uses a nested for loop to first access which array or the index are the values provided by the user will be placed
		System.out.println("Please enter in the values for the first matrix: ");
		for (int i = 0; i < matrix1.length; i++)
		{
			//Assigns values for each value of the matrix based on each input and uses j to count each user input until it equals the width of the matrix
			System.out.println("Please enter the values at index " + i);
			for(int j = 0; j < matrix1[i].length; j++)
			{
				//grabs the user input and uses the index (i)
				//And the index inside of the specific array (j) to assign it to the correct component of the matrix
				matrix1[i][j] = k.nextInt();
			}
		}
	
		//Uses the same concept to get the inputs as above just for the second array
		System.out.println("Please enter in the values for the second matrix: ");
		for (int i = 0; i < matrix2.length; i++)
		{
			System.out.println("Please enter the values at index " + i);
			for(int j = 0; j < matrix2[i].length; j++)
			{
				matrix2[i][j] = k.nextInt();
			}
		}
		
		//this is a a matrix to store the resulted values of the sum of each component of the first matrix and second matrix
		int [][] matrixSumOf1And2 = new int[matrix1.length][matrix1[0].length];
		
		//Uses the same concepts to assign the values of the sum of the first and second matrix components to another matrix at the same index
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2[i].length; j++)
			{
				//Uses i and j to assign the add the components at the same index in matrix 1 and 2 to the new matrix at the same index.
				matrixSumOf1And2[i][j] = (matrix1[i][j] + matrix2[i][j]);
				
			}
		}
		
		//Uses a nested for loop to access the correct value of the index and print it in the same rows and columns as the matrix
		//Prints the first Matrix
		for( int i = 0; i < matrix1.length; i++)
		{
			for(int j = 0; j < matrix1[i].length; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("+");
		
		//Prints the Second Matrix
		for( int i = 0; i < matrix2.length; i++)
		{
			for(int j = 0; j < matrix2[i].length; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		
		//Prints the resulting array of matrix 1 and 2 added together
		for( int i = 0; i < matrixSumOf1And2.length; i++)
		{
			for(int j = 0; j < matrixSumOf1And2[i].length; j++)
			{
				System.out.print(matrixSumOf1And2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
