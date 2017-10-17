/**
 * 
 */
package uk.ac.qub.fourthpractical;

import java.util.Scanner;

/**
 * This class was written to solve the problems in part 3 of the fourth practical for CSC7061
 * @author ML
 *
 */
public class PartThree {

	/**
	 * This method demonstrates various for loops
	 * @param args
	 */
	public static void main(String[] args) {
		// Part 3.1 - repeating inputted name 10 times
		// Declare var and scanner
		String name;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your name...");
		name = keyboard.next();
		
		// Print to screen 10 times with for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// 3.2 - print list of ints
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d", i);
			if (i < 10) {
				System.out.printf(", ", i); // Appends a comma to each number except the last
			}
		}
		
		System.out.println();
		
		// 3.3 - print countdown with for loop
		for (int i = 10; i > 0; i--) {
			System.out.printf("%d, ", i);
		}
		
		System.out.printf("Liftoff!\n");
		
		// 3.4 - same as 3.3 but with a while loop
		// Declare var
		int countdown = 10;
		
		while(countdown > 0) {
			System.out.printf("%d, ", countdown);
			countdown--; // Decrement the countdown
		}
		
		System.out.printf("Liftoff!\n"); // Prints when countdown has reached zero
		
		// 3.5 - printing even numbers from 1-100
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) { // If the remainder from dividing by two is zero, the number is even
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		// 3.6 - printing odd numbers from 10-40
		for (int i = 10; i <= 40; i++) {
			if ((i % 2) > 0) { // If the remainder from dividing by two is greater than zero, the number is odd
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		// 3.7 - countdown from 100 to zero with break at 333
		for (int i = 1000; i >= 0; i-- ) {
			if (i == 333) { // Check if we've reached 333 and if so then break from the loop
				System.out.println("Launch aborted!");
				break;
			} else {
				System.out.printf("%d, ", i);
			}
		}
		
		System.out.println();
		
		// 3.8 - nested for loops
		// This was my original solution
//		for(int i = 0; i < 3; i++) {
//			for (int j = 1; j <= 10; j++) {
//				// Append the number of stars depending on which iteration of the outer loop we're on
//				if (i == 0) {
//					System.out.print("*");
//				} else if (i == 1) {
//					System.out.print("**");
//				} else {
//					System.out.print("***");
//				}
//
//				System.out.print(j);
//				
//				if (j < 10) {
//					System.out.print(", "); // Append a comma to all numbers except the last in the list
//				}
//			}
//			System.out.println();
//		}
		
		// Following solution from David Pinkerton (much better in my view)
		String asterisk = "";
		
		for (int i = 0; i < 3; i++) {
			asterisk += "*"; // Append asterisk string on each outer loop
			for (int j = 1; j <=10; j++) {
				// Set a condition to avoid the comma on the last number
				if (j == 10) {
					System.out.printf("%s%d\n", asterisk, j);
					break;
				}
				System.out.printf("%s%d,", asterisk, j);
			}
		}
		
		System.out.println();
		
		// 3.9 - printing leap years between 1910-1990
		for (int year = 1910; year <= 1990; year++) {
			if ((year % 4) == 0) { // Any year divisible by 4 with no remainder is a leap year
				System.out.print(year + " ");
			}
		}
		
		System.out.println();
		
		// 3.10 - taking user input and checking age for within range and giving specific outputs
		// Declare vars
		// boolean withinRange = false;
		int age = 0;
		
		System.out.println("Please enter your age between 1-100...");
		do {
			try { // The following may generate exceptions
				age = keyboard.nextInt();
				
				if ((age < 1) || (age > 120)) {
					System.out.println("Sorry, that's not within the specified range! Please try again...");
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that's not a valid input. Please try again.");
				keyboard.nextLine();
			}
		} while ((age < 1) || (age > 120));
		
		// Print results within the specified boundaries
		if ((age >= 1) && (age <= 30)) {
			System.out.println("You are young!");
		} else if ((age >= 31) && (age <= 60)) {
			System.out.println("You are getting on!");
		} else {
			System.out.println("You look good for your age!");
		}
		
		keyboard.close();
	}

}
