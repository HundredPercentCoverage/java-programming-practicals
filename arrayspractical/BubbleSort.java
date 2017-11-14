/**
 * 
 */
package arrayspractical;

/**
 * Class written to demonstrate a bubble sort algorithm
 * 
 * @author ML
 *
 */
public class BubbleSort {

	/**
	 * Bubble sort method - sorts an array of ints into ascending order
	 * @param inputA input array of ints
	 * @return int array
	 */
	public static int[] bubbleSort(int[] inputA) {
		boolean sorted = false; // Flag to determine if the array is sorted
		int temp = 0; // Temporary var to hold value for swappings

		// Can be a while loop but I like this one in this instance
		do {
			sorted = true; // Assume true at first
			
			// For each element of the array (except the last as a swap will be out of bounds)
			for (int count = 0; count < (inputA.length - 1); count++) {
				
				// If this element is bigger than the next one they need to be swapped
				if (inputA[count] > inputA[count + 1]) {
					temp = inputA[count];
					inputA[count] = inputA[count + 1];
					inputA[count + 1] = temp;
					sorted = false; // A swap happened so we're not sure if the array is sorted
				}
			}
		} while (!sorted);

		return inputA;
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 2, 1, 127, 3, 14, 8 };
		
		System.out.println("Unsorted:");
		
		for (int num : array) {
			System.out.print(num + " ");
		}
		
		System.out.println();

		int[] newArray = bubbleSort(array);

		System.out.println("Sorted:");
		
		for (int num : newArray) {
			System.out.print(num + " ");
		}

	}

}
