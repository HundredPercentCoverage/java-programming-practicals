/**
 * 
 */
package methodspractical;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * This class provides my solutions to the fifth practical (methods)
 * 
 * @author ML
 *
 */
public class Part1 {

	/**
	 * A method that displays whether a given int is odd or even
	 * 
	 * @param num
	 *            int
	 */
	public static void oddOrEven(int num) {
		System.out.println((num % 2 == 0) ? "Even" : "Odd");
	}

	/**
	 * A method that converts a given char into an upper case letter if it is lower
	 * case
	 * 
	 * @param letter
	 *            char to convert
	 */
	public static void convertFromUpperToLower(char letter) {
		if (Character.isLowerCase(letter)) {
			letter = Character.toUpperCase(letter);
		}
		System.out.println(letter);
	}

	/**
	 * A method that takes two integers and determines if the first is a multiple of
	 * the second
	 * 
	 * @param num1
	 *            First int
	 * @param num2
	 *            Second int
	 */
	public static void isMultiple(int num1, int num2) {
		System.out.println((num1 % num2 == 0) ? "True" : "False");
	}

	/**
	 * A method that generates ten random numbers between 1-100
	 */
	public static void generateTenRandomNumbers() {
		Random random = new Random();

		for (int count = 0; count < 10; count++) {
			System.out.println("Generated: " + (random.nextInt(100) + 1));
		}
	}

	/**
	 * A method that prints a countdown of from a given number between 5 - 50 with
	 * the same number of stars beside each number. Number outside range produces an
	 * error message
	 * 
	 * @param num Input int
	 */
	public static void countdownStars(int num) {
		if ((num >= 5) && (num <= 50)) {

			for (int count = num; count > 0; count--) {
				System.out.print(count + " ");

				for (int loop = 1; loop <= count; loop++) {
					System.out.print("*");
				}

				System.out.println();

			}
		} else {

			System.out.println("Error, not in range");

		}

	}

	/**
	 * A method to take an integer as an input and display it in word form as long
	 * as it is between 1-9
	 * 
	 * @param num int
	 */
	public static void printNumberAsWord(int num) {
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}
	
	/**
	 * Takes an integer as an upper boundary limit and adds all the integers from 1
	 * up to that number and prints the result. Also calculates the average of those
	 * numbers
	 * @param limit
	 */
	public static void sumAndAverage(int limit) {
		int sum = 0;
		double average = 0;
		
		for (int count = 1; count <= limit; count++) {
			sum += count;
		}
		
		average = (double)sum / limit;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
	}
	
	/**
	 * Displays a message based on whether it is AM or PM
	 */
	public static void amOrPm() {
		Calendar cal = Calendar.getInstance();
		
		if (cal.get(Calendar.AM_PM) == 0) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		oddOrEven(12);
		convertFromUpperToLower('r');
		isMultiple(28, -14);
		generateTenRandomNumbers();

		System.out.println("Please enter a number between 5-50...");
		countdownStars(keyboard.nextInt());

		System.out.println("Please enter a number between 1-9");
		printNumberAsWord(keyboard.nextInt()); // Will generate an exception if someone enters something other than an int
		
		sumAndAverage(100);
		
		amOrPm();

		keyboard.close();
	}

}
