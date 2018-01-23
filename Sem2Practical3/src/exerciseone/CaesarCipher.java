/**
 * 
 */
package exerciseone;

/**
 * Class that uses a simple Caeser cipher to encrypt / decrypt a String
 * @author ML
 *
 */
public class CaesarCipher {
	
	/**
	 * Default constructor
	 */
	public CaesarCipher () { 
		
	}
	
	/**
	 * Decrypts a given String by subtracting the key value from each character
	 * @param original Encrypted String
	 * @param key Key value
	 * @return Decrypted String
	 */
	public static String decrypt(String original, int key) {
		String result = "";
		char ch;
		for(int loop = 0; loop < original.length(); loop++) {
			ch = (char) (original.charAt(loop) - key);
			result += ch;
		}
		
		return result;
	}
	
	/**
	 * Encrypts a given String by adding the key value to each character in the String
	 * @param original String to encrypt
	 * @param key Key value to add to each character
	 * @return Encrypted String
	 */
	public static String encrypt(String original, int key) {
		String result = "";
		char ch;
		for(int loop = 0; loop < original.length(); loop++) {
			ch = (char) (original.charAt(loop) + key);
			result += ch;
		}
		
		return result;
	}

	/**
	 * Main method (acts as ad hoc test)
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test value...");
		System.out.println(decrypt("Neze", 4));
		
		String input = "Jfy%Xqjju%Of{f%Wjujfy%2%gj%knwxy%yt%jrfnq%ymfy%yt%Fnifs%yt%|ns";
		
		System.out.println("Decrypting input string...");
		// Not sure what the key value is but we know it's between 1-10
		for(int loop = 1; loop <= 10; loop++) {
			System.out.println(decrypt(input, loop));
		}

	}

}
