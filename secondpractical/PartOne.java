/**
 * 
 */
package uk.ac.qub.secondpractical;

/**
 * @author 14292017
 *
 */
public class PartOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print 'Hello World' to screen
		System.out.println("Hello world!\n");
		
		// Print sentence onto two lines
		System.out.println("Hello world! I am alive.\nI can write on two lines!\n");
		
		// Print sentence on two lines with an empty line between
		System.out.println("Hello world! I am alive.\n\nI can write on two lines!\n");
		
//		// Print a Christmas tree (boring way)
//		System.out.println("Happy Christmas (old way)");
//		System.out.println("     *");
//		System.out.println("    ***");
//		System.out.println("   *****");
//		System.out.println("  *******");
//		System.out.println(" *********\n");
		
		// Print a Christmas tree (fancy way)
		String stars = "*"; // This will be our string of stars, initialise with one
		String spaces = ""; // Our string of spaces from the side of the console
		int numLines = 5; 	//Number of rows on our tree
		
		System.out.println("Happy Christmas (cool way)");
		
		for(int i=0; i<numLines; i++) { 	// Loop through each line
			for(int j=numLines; j>i; j--) {	// Build the string of spaces to the row of stars - spaces to first row = number of lines
				spaces += " "; 				// Concatenate 'spaces' string incrementally
			}
			System.out.println(spaces + stars);
			
			stars += "**"; 	// Add two stars for the next row (odd numbers)
			spaces = ""; 	// Need to reset the number of spaces to start a new spaces string for the next row
		}
		System.out.println();
		
		// Print Macbeth text with tab delimiter \t
		System.out.println("First Witch\tWhen shall we three meet again?");
		System.out.println("\t\tIn thunder, lightning or in rain?\n");
		System.out.println("Second Witch\tWhen the hurlyburly's done,");
		System.out.println("\t\tWhen the battle's lost and won\n");
		System.out.println("Third Witch\tThat will be ere the set of sun.\n");
	}

}
