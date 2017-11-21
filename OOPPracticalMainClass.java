/**
 * 
 */
package ooppractical;

/**
 * Main class for the OOP practical
 * @author ML
 *
 */
public class OOPPracticalMainClass {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Error handling
		try {
			// Instantiate custom class
			Quotes quotes = new Quotes();
			
			// Invoke instance methods
			quotes.churchillQuote();
			quotes.shakespeareQuote();
			quotes.oscarWildeQuote();
			quotes.georgeWBushQuote();
			quotes.albertEinsteinQuote();
		} catch (Exception e) {
			System.out.println("Sorry, there's been a problem");
			e.printStackTrace();
		} finally {
			System.out.println("Thanks for using the program!");
		}

	}

}
