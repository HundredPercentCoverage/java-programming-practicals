/**
 * 
 */
package practicalcalc;

/**
 * Main class to demonstrate Calculator class for Part 3 of the OOP practical
 * @author ML
 *
 */
public class CalcMain {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Instantiate class
			Calculator calc = new Calculator();
			
			// Test all the instance methods
			int result = calc.addNumbers(1, 5);
			System.out.println("Adding 1 and 5 results in: " + result);
			
			result = calc.subtract(1, 5);
			System.out.println("Subtracting 5 from 1 results in: " + result);
			
			result = calc.multiply(2, 5);
			System.out.println("Multiplying 2 by 5 results in: " + result);
			
			result = calc.divide(6, 3);
			System.out.println("Dividing 6 by 3 results in: " + result);
			
			double sqr = calc.sqrRoot(9);
			System.out.println("Square root of 9 is: " + sqr);
			
			calc.setMemory(5);
			System.out.println("Memory is set to: " + calc.getMemory());
			
			calc.clearMemory();
			System.out.println("Memory is set to: " + calc.getMemory());
		} catch (Exception e) {
			System.out.println("Sorry, there's been a problem.");
			e.printStackTrace();
		} finally {
			System.out.println("Program ending...");
		}

	}

}
