/**
 * 
 */
package practicalcalc;

/**
 * Calculator class written for Part 3 of the OOP practical
 * @author ML
 *
 */
public class Calculator {
	
	// Instance vars
	private int memory;

	// Instance methods
	
	/**
	 * Constructor
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Adds two ints
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * Subtracts two ints (num1 - num2)
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * Multiplies two ints
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * Divides two ints
	 * @param num1 Numerator
	 * @param num2 Denominator
	 * @return int
	 */
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * Finds square root of an int
	 * @param num
	 * @return double
	 */
	public double sqrRoot(int num) {
		return Math.sqrt((double)num);
	}
	
	/**
	 * Sets memory
	 * @param num int
	 */
	public void setMemory(int num) {
		memory = num;
	}
	
	/** 
	 * Returns memory value
	 * @return int
	 */
	public int getMemory() {
		return memory;
	}
	
	/**
	 * Clears memory
	 */
	public void clearMemory() {
		memory = 0;
	}
}
