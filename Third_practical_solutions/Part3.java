/**
 * 
 */
package uk.ac.qub.thirdpractical;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class was written to solve part 3 of the third practical
 * @author ML
 *
 */
public class Part3 {

	/**
	 * This method does both parts of the Part 3 element of the third practical.
	 * 1 - Takes user name provided they are over 17, taking care to not accept negative ages
	 * 2 - Takes user string as input and recognises if they have typed con or lab (in any case) and warns on other inputs
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare vars
		int age = 0;
		String name, vote;
		
		// Declare input Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Ask user for age input
		System.out.println("Please enter your age...");
		
		try {
			// Receive input and assign to age var
			age = keyboard.nextInt();
			
			if (age >= 17) {
				System.out.println("Please enter your name ...");				// Prompt for age
				
				name = keyboard.next();											// Take input and assign to name var
				
				System.out.println("User name is: " + name + ", aged " + age);	// Print name and age
			} else if (age < 17 && age > 0) { 
				System.out.println("Too young to continue.");					// Print if user too young
			} else {
				System.out.println("Sorry, don't recognise your input.");		// Print if user enters negative int
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Error - not a valid input");
		}
		
		// If there is an input exception with the last section then the scanner will not have moved on yet and will be stuck on the last thing entered
		keyboard.nextLine();
		
		// Voting part
		System.out.println();
		System.out.println("Voting...");
		System.out.println("Enter 'con' for Conservative and 'lab' for Labour");
		
		// Take user input string, set it to lower case and assign to vote var
		vote = keyboard.next().toLowerCase();

		// Check the vote var for the results and respond accordingly
		if (vote.equals("con")) {
			System.out.println("Vote registered for Conservative");	// Print if vote is con
		} else if (vote.equals("lab")) {
			System.out.println("Vote registered for Labour");		// Print if vote is lab
		} else { 
			System.out.println("Sorry voting party unrecognised");	// Print if vote is nonsense
		}
		
		keyboard.close(); // Cleanup

	}

}
