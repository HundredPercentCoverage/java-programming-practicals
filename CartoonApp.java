/**
 * 
 */
package cartoonapp;

/**
 * Main class to demonstrate SimpsonsCharacter class
 * @author ML
 *
 */
public class CartoonApp {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Create instances of SimpsonsCharacter
		SimpsonsCharacter bart = new SimpsonsCharacter();
		SimpsonsCharacter homer = new SimpsonsCharacter();
		SimpsonsCharacter lisa = new SimpsonsCharacter();
		SimpsonsCharacter nelson = new SimpsonsCharacter();
		
		// Set the instance vars
		bart.setName("Bart");
		bart.setCatchPhrase("Eat my shorts!");
		
		homer.setName("Homer");
		homer.setCatchPhrase("D'Oh!");
		
		lisa.setName("Lisa");
		lisa.setCatchPhrase("I'll be in my room");
		
		nelson.setName("Nelson");
		nelson.setCatchPhrase("HaHa");
		
		// Print out as requested
		System.out.print(bart.getName() + " says ");
		bart.sayCatchPhrase();
		
		System.out.print(homer.getName() + " says ");
		homer.sayCatchPhrase();
		
		System.out.print(lisa.getName() + " says ");
		lisa.sayCatchPhrase();
		
		System.out.print(nelson.getName() + " says ");
		nelson.sayCatchPhrase();

	}

}
