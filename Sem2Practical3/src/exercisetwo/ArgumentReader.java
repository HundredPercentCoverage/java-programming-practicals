/**
 * 
 */
package exercisetwo;

import java.util.Arrays;

/**
 * @author ML
 *
 */
public class ArgumentReader {

	/**
	 * Method to change an array of arguments <code>(String[])</code> into a sorted 
	 * <code>Integer</code> array and print to screen.
	 * Arguments that cannot be parsed into an int value are rejected.
	 * Arguments outside the range 0-9 are rejected.
	 * @param args
	 */
	public static void integerArgs(String[] args) {
		boolean valid = true;
		
		// First check that the args array isn't empty
		if (args.length > 0) {
			// Create new array of Integer objects same length as the args array
			Integer[] integerArgsArray = new Integer[args.length];
			
			for (int loop = 0; loop < args.length; loop++) {
				// Check to see if the current argument is valid (number)
				try {
					integerArgsArray[loop] = new Integer(args[loop]);
				} catch (NumberFormatException e) {
					System.out.println("Error - argument is not a number : " + args[loop]);
					System.out.println("Ending program...");
					valid = false;
					break;
				}
				
				// Check that the argument is within the given range
				if (integerArgsArray[loop] < 0 || integerArgsArray[loop] > 9) {
					System.out.println("Error - invalid argument : " + integerArgsArray[loop]);
					System.out.println("Ending program...");
					valid = false;
					break;
				}
			}
			
			// If everything is OK...
			if (valid) {
				Arrays.sort(integerArgsArray);
				
				for (Integer i : integerArgsArray) {
					System.out.println(i.intValue());
				}
			}
			
		} else {
			System.out.println("No arguments provided!");
		}
	}
	
	/**
	 * Main method
	 * @param args String array of arguments passed to sort method
	 */
	public static void main(String[] args) {
		try {
			integerArgs(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
