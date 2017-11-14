/**
 * 
 */
package arrayspractical;

import java.util.Scanner;

/**
 * Class written for Part One of the Arrays Practical
 * 
 * @author ML
 *
 */
public class PartOne {

	/**
	 * Question 7 - method to display contents of array
	 * 
	 * @param array
	 */
	public static void displayArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Question 1 (and 4) - calculating total pay over a week

		// final double RATE_OF_PAY = 10.25; // Constant, £ per hour, should really be
		// BigDecimal
		final double RATE_OF_PAY = 11.50; // For question 4

		// int[] hoursWorked = { 8, 7, 9, 7, 4 }; // Mon-Fri
		int[] hoursWorked = { 8, 7, 9, 7, 4, 6 }; // For question 4
		int totalHoursWorked = 0;

		// String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; // For question 4

		// Should really loop through the hours array, or maybe not?
		for (int count = 0; count < days.length; count++) {
			System.out.println("Hours worked on " + days[count] + ": " + hoursWorked[count]);
			totalHoursWorked += hoursWorked[count];
		}

		// Display values
		System.out.println("Total hours worked in the week: " + totalHoursWorked);
		System.out.println("Total pay for the week: " + ((double) totalHoursWorked * RATE_OF_PAY));
		System.out.println();

		// Question 2 (and 4) - Temperatures

		double[] temps = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 }; // Stored temperatures
		double totalTemps = 0.0;
		double maxTemp = temps[0]; // For question 4
		double minTemp = temps[0];

		for (double temp : temps) { // Using enhanced for
			maxTemp = (maxTemp < temp) ? temp : maxTemp; // Check and assign max/min values
			minTemp = (minTemp > temp) ? temp : minTemp;
			totalTemps += temp; // Add all values
		}

		// Print average
		System.out.printf("Average temperature is: %.2f\n", totalTemps / temps.length);
		System.out.println("Minimum temperature is: " + minTemp);
		System.out.println("Maximum temp is: " + maxTemp);
		System.out.println();

		// Question 3 - Heights

		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		double smallestHeight = heights[0]; // Set smallest and tallest to first element initially
		double tallestHeight = heights[0];
		double totalHeight = 0.0;

		for (int loop = 0; loop < heights.length; loop++) {
			// Check if this element is larger or greater than the current tallest or
			// smallest
			// Assign to tallest and smallest vars if so
			smallestHeight = (smallestHeight > heights[loop]) ? heights[loop] : smallestHeight;
			tallestHeight = (tallestHeight < heights[loop]) ? heights[loop] : tallestHeight;

			// Add element values together
			totalHeight += heights[loop];
		}

		// Print relevant data
		System.out.println("Smallest is: " + smallestHeight);
		System.out.println("Tallest is: " + tallestHeight);
		System.out.println("Average height is: " + totalHeight / heights.length);
		System.out.println();

		// Question 5 - Names

		// Vars for storing number of occurrences
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		// Declare a scanner and get the user's name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name...");
		String name = keyboard.nextLine();

		// Lower case the string to avoid case sensitivity
		name.toLowerCase();

		// Assign string to char array
		char[] letters = name.toCharArray();

		// Loop through each letter and increment vowel values as necessary
		for (char letter : letters) {
			switch (letter) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				break;
			}
		}

		// Print results
		System.out.println("Occurrences of 'a': " + a);
		System.out.println("Occurrences of 'e': " + e);
		System.out.println("Occurrences of 'i': " + i);
		System.out.println("Occurrences of 'o': " + o);
		System.out.println("Occurrences of 'u': " + u);
		System.out.println();

		keyboard.close();

		// Question 6 - even numbers

		int[] myArray = new int[50]; // Array to hold the even numbers
		int index = 0; // Index for the array
		int total = 0;

		// For every number from 1-100
		for (int count = 1; count <= 100; count++) {
			if (count % 2 == 0) { // Check if even
				myArray[index] = count; // Add to array
				index++; // Increment array index
			}
		}

		// For every element in the array
		for (int num : myArray) {
			System.out.print(num + " "); // Print the value
			total += num; // Add the value to the total
		}

		System.out.println();
		System.out.println("Total of elements in the array: " + total); // Print total
		System.out.println();
		
		// Question 7
		int[] arrayToDisplay = { 1, 2, 3, 4, 5, 6, 7, 8 };
		displayArray(arrayToDisplay);
		System.out.println();
		
		// Question 8 - marks
		
		// Arrays of marks
		int[] assignmentOne = {24,42,29,66,77};
		int[] assignmentTwo = {79,68,31,22,42};
		
		double assignmentOneAverage = 0;
		double assignmentTwoAverage = 0;
		
		// Should really do separate for loops in case the length of one array changes
		for (int num : assignmentOne) {
			assignmentOneAverage += num;
		}
		
		for (int num : assignmentTwo) {
			assignmentTwoAverage += num;
		}
		
		// Calculate averages
		assignmentOneAverage /= assignmentOne.length;
		assignmentTwoAverage /= assignmentTwo.length;
		
		// Determine best average
		String bestAverage = (assignmentOneAverage > assignmentTwoAverage) ? "Assignment 1" : "Assignment 2";
		
		// Print results
		System.out.println("Assignment 1 average: " + assignmentOneAverage);
		System.out.println("Assignment 2 average: " + assignmentTwoAverage);
		System.out.println("Overall average: " + (assignmentOneAverage + assignmentTwoAverage));
		System.out.println("Best average: " + bestAverage);
		System.out.println();
		
		// Question 9 - String array
		
		String quote = "Continuous effort not strength nor intelligence is the key for unlocking our potential";
		String[] words = quote.split("\\s"); // Split quote at every space and put in String array
		
		// Result vars
		int totalLetters = 0;
		String smallestWord = words[0];
		String largestWord = words[0];
		
		// For each word in the String array
		for (String word : words) {
			System.out.print(word + " "); // Print the word
			
			totalLetters += word.length(); // Add length of word to letter total
			
			// Update largest and smallest word as needed
			smallestWord = (word.length() < smallestWord.length()) ? word : smallestWord;
			largestWord = (word.length() > largestWord.length()) ? word : largestWord;
		}
		
		System.out.println();
		
		// Print results
		System.out.println("Length of the quote is " + words.length + " words");
		System.out.println("The total number of letters is " + totalLetters);
		System.out.println("The smallest word is '" + smallestWord + "'");
		System.out.println("The largest word is '" + largestWord + "'");
	}

}
