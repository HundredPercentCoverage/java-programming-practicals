/**
 * 
 */
package uk.ac.qub.fourthpractical;

/**
 * This class was written for solution of Part One of the fourth practical for CSC7061
 * @author ML
 *
 */
public class PartOne {

	/**
	 * This method uses as while loop to sum a series of ints
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare vars
		int num = 1;
		int sum = 0;
		
		// Loop until num is 11
		while (num < 11) {
			sum += num; // Equivalent to sum = sum + num;
			System.out.println("The sum is " + sum);
			num++; //Increment num
		}

	}

}
