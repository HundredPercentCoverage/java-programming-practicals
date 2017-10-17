/**
 * 
 */
package uk.ac.qub.thirdpractical;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class was written to solve part one of the third practical
 * @author ML
 *
 */
public class Part1 {

	/**
	 * This method will take an input (double) from the user and perform various mathematical operations on it, displaying the results
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare var
		double inputNum = 0.0;
		
		// Declare Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Request input from user
		System.out.println("Please enter a decimal point number in the format xx.xxxx e.g. 12.3456");
		
		// Following code may generate exceptions
		try {
			// Read the input value and assign to inputNum
			inputNum = keyboard.nextDouble();
			
			// Print results using static methods from java.lang.Math
			System.out.printf("Number rounded (two decimal places)\t: %.2f\n", inputNum);
			System.out.printf("Number square (three decimal places)\t: %.3f\n", Math.pow(inputNum, 2.0));
			System.out.printf("Number cubed to (three decimal places)\t: %.3f\n", Math.pow(inputNum, 3.0));
			System.out.printf("Square root (four decimal places, args)\t: %.4f\n", Math.sqrt(inputNum));
		}
		catch (InputMismatchException e) { // In the event the user doesn't enter an int or double
			// Display error
			System.out.println("Error - that is not a valid input.");
		}
		
		// Cleanup
		keyboard.close();
		
	}

}
