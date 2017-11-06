/**
 * 
 */
package methodspractical;

import java.util.Random;
import java.util.Scanner;

/**
 * Class written for part 2 of practical 5 in CSC7061
 * @author ML
 *
 */
public class Part2 {

	/**
	 * Returns the area of a rectangle with given height and base
	 * 
	 * @param height
	 *            (double)
	 * @param base
	 *            (double)
	 * @return double
	 */
	public static double rectArea(double height, double base) {
		return height * base;
	}

	/**
	 * Returns the name of the month for a given month number within range 1-12
	 * 
	 * @param month
	 *            int
	 * @return String
	 */
	public static String getMonthName(int month) {
		String monthName = "";

		// Assign the right string to monthName based on the checked month number
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "Not a valid number";
			break;
		}

		return monthName;
	}

	/**
	 * Returns the average of three given ints
	 * 
	 * @param num1
	 *            int
	 * @param num2
	 *            int
	 * @param num3
	 *            int
	 * @return double
	 */
	public static double getAverage(int num1, int num2, int num3) {
		return (double) (num1 + num2 + num3) / 3.0;
	}

	/**
	 * Returns the capital of a given G8 country. Case is ignored.
	 * 
	 * @param country
	 *            String
	 * @return
	 */
	public static String getG8Capital(String country) {
		String capital = "";

		// You can do this with switch / case now, but for demonstrations I'll use
		// if-else
		if (country.equalsIgnoreCase("Canada")) {
			capital = "Ottawa";
		} else if (country.equalsIgnoreCase("France")) {
			capital = "Paris";
		} else if (country.equalsIgnoreCase("Germany")) {
			capital = "Berlin";
		} else if (country.equalsIgnoreCase("Italy")) {
			capital = "Rome";
		} else if (country.equalsIgnoreCase("Japan")) {
			capital = "Tokyo";
		} else if (country.equalsIgnoreCase("Russia")) {
			capital = "Moscow";
		} else if (country.equalsIgnoreCase("United Kingdom")) {
			capital = "London";
		} else if (country.equalsIgnoreCase("United States")) {
			capital = "Washington";
		} else {
			capital = "Not a G8 country";
		}

		return capital;
	}

	/**
	 * Simulates a coin toss.
	 * 
	 * @param call
	 *            String
	 */
	public static void coinToss(String call) {
		Random randGen = new Random(); // Random number generator

		// Generate a random number between 0-1.
		// If the outcome is 0, assign "heads" to the result string
		// Otherwise assign the result "tails" to the result string
		String result = (randGen.nextInt(2) == 0) ? "heads" : "tails";

		// Using a regex to check if the user has entered a sensible call
		if (call.matches("(?i)^heads|tails$")) {

			// Check if the call matches the result
			if (call.equalsIgnoreCase(result)) {
				System.out.println("Result is " + result + ", you win!");
			} else {
				System.out.println("Result is " + result + ", sorry!");
			}

		} else {
			System.out.println("You didn't type the right thing, did you?");
			System.out.println("THAT'S NOT HOW THIS WORKS");
		}
	}

	/**
	 * Main method of the class
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String call = "";

		System.out.println("Area of rect is:" + rectArea(7.5, 2.3));
		System.out.println(getMonthName(5));
		System.out.println(getAverage(5, 7, 122));
		System.out.println("The capital of Canada is " + getG8Capital("Canada"));

		System.out.println("Coin toss - please enter heads or tails...");
		call = keyboard.nextLine();
		coinToss(call);

		keyboard.close();
	}

}
