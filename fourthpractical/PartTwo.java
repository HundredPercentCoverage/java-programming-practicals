/**
 * 
 */
package uk.ac.qub.fourthpractical;

import java.util.Scanner;

/**
 * This class was written for solution of Part One of the fourth practical for CSC7061
 * @author ML
 *
 */
public class PartTwo {

	/**
	 * This method uses a loop display a menu to the user and allows them to choose options.
	 * The loop will exit when the user chooses the 5th option 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		// Declare boolean var to flag if the user has selected exit
		boolean running = true;
		
		// Loop for the menu system
		do {
			System.out.println("1. File\n");
			System.out.println("2. Edit\n");
			System.out.println("3. Save\n");
			System.out.println("4. Delete\n");
			System.out.println("5. Exit\n");
			System.out.printf("   Select option: ");
			
			// Checking the user input - 1 through 5 will produce results, anything else will show an error
			switch(keyboard.next()) {
			case "1":
				System.out.println("\nFile selected\n");
				break;
			case "2":
				System.out.println("\nEdit selected\n");
				break;
			case "3":
				System.out.println("\nSave selected\n");
				break;
			case "4":
				System.out.println("\nDelete selected\n");
				break;
			case "5":
				System.out.println("\nExiting...\n");
				running = false; // User has selected to exit, so this var is changed
				break;
			default:
				System.out.println("\nError, not a valid input\n");
				break;
			}
		} while (running);
		
		keyboard.close(); // Cleanup

	}

}
