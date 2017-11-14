/**
 * 
 */
package arrayspractical;

/**
 * Class written for Part Two of the Arrays Practical
 * @author ML
 *
 */
public class PartTwo {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Vars
		int[][] matrix = new int[4][4]; // 2D array
		int val = 0; // Value to put into each element
		int total = 0;
		int numElements = 0;
		
		// For each row i.e. for each overall element in the array
		for (int row = 0; row < matrix.length; row++) {
			// For each column i.e. for each element in the elements of the overall array
			for (int col = 0; col < matrix[row].length; col++) {
				val += 2;
				matrix[row][col] = val; // Insert value
				
				System.out.printf("%-2d ", val); // Print value
				
				total += val;
				numElements++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total of all values is " + total);
		
		// This is OK if it's a square array
		//System.out.println("Average of all values is " + (double) total / (matrix.length * matrix[0].length));

		// This is better generally
		System.out.println("Average of all values is " + (double) total / numElements);
	}

}
