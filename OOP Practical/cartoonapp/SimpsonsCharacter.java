/**
 * 
 */
package cartoonapp;

/**
 * @author ML
 *
 */
public class SimpsonsCharacter {

	// Instance vars
	private String name;
	private String catchPhrase;
	
	/**
	 * Constructor
	 */
	public SimpsonsCharacter() {
		name = "";
		catchPhrase = "";
	}
	
	// Instance methods
	
	/**
	 * Returns name of the character
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets name of the character
	 * @param input String
	 */
	public void setName(String input) {
		this.name = input;
	}
	
	/**
	 * Returns the catchphrase of the character
	 * @return String
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}
	
	/**
	 * Set the catchphrase of the character
	 * @param input String
	 */
	public void setCatchPhrase(String input) {
		this.catchPhrase = input;
	}
	
	/**
	 * Print the catchphrase of the character to console
	 */
	public void sayCatchPhrase() {
		System.out.println(catchPhrase);
	}

}
