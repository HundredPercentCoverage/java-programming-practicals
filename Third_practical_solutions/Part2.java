/**
 * 
 */
package uk.ac.qub.thirdpractical;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class was written to solve part 2 of the third practical
 * @author 14292017
 *
 */
public class Part2 {

	/**
	 * This method prompts the user for a Masters mark and classify it accordingly
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare var
		int finalMark = 0;
		
		// Declare Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Request mark from user
		System.out.println("Enter mark (whole number) ...");
		
		// Following code may generate exceptions
		try {
			// Read in an int input and assign to finalMark
			finalMark = keyboard.nextInt();
			
			// Check where finalMark is within the different boundaries for classifications
			if (finalMark >= 70) {
				// Print Distinction
				System.out.println("Classification : Distinction");
			} else if (finalMark < 70 && finalMark >= 60) {
				// Print Merit
				System.out.println("Classification : Merit");
			} else if (finalMark < 60 && finalMark >= 50) {
				// Print Pass
				System.out.println("Classification : Pass");
			} else {
				// Print FAIL
				System.out.println("Classification : Fail");
			}
		}
		catch (InputMismatchException e) {
			// Print error
			System.out.println("Error - that is not a valid input.");
		}

		keyboard.close();
		
	}

}
