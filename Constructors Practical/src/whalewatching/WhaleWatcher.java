/**
 * 
 */
package whalewatching;

/**
 * @author ML
 *
 */
public class WhaleWatcher {
	
	/**
	 * @param whales
	 */
	public static void displayAll(Whale[] whales) {
		for(Whale whale : whales) {
			System.out.println(whale.toString());
		}
		System.out.println();
	}
	
	/**
	 * @param mainOcean
	 * @param whales
	 */
	public static void whalesByOcean(String mainOcean, Whale[] whales) {
		System.out.println("Displaying the whales that swim in " + mainOcean + "...");
		for(Whale whale : whales) {
			if (whale.getMainOcean() == mainOcean) {
				System.out.println(whale.getName());
			}
		}
		System.out.println();
	}
	
	/**
	 * @param whales
	 */
	public static void fastestWhale(Whale[] whales) {
		Whale fastestWhale = whales[0];
		for(Whale whale : whales) {
			if (whale.getMaxSpeed() > fastestWhale.getMaxSpeed()) {
				fastestWhale = whale;
			}
		}
		System.out.println("The fastest whale is the " + fastestWhale.getName() + " whale.");
		System.out.println();
	}
	
	/**
	 * @param whales
	 */
	public static void averageLength(Whale[] whales) {
		int total = 0;
		for(Whale whale : whales) {
			total += whale.getLength();
		}
		System.out.printf("The average length of all whales is %.2f\n\n", (double)total / whales.length);
	}
	
	/**
	 * @param whales
	 */
	public static void heaviestWhale(Whale[] whales) {
		Whale heaviest = whales[0];
		
		for (Whale whale : whales) {
			if(whale.getWeight() > heaviest.getWeight()) {
				heaviest = whale;
			}
		}
		System.out.println("The heaviest whale is the " + heaviest.getName() + " whale.");
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "Antarctic", 919, 13, 13);

		Whale[] whales = { w1, w2, w3, w4 };
		
		displayAll(whales);
		whalesByOcean("Atlantic", whales);
		fastestWhale(whales);
		averageLength(whales);
		heaviestWhale(whales);
	}

}
