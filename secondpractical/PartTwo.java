package uk.ac.qub.secondpractical;

public class PartTwo {

	public static void main(String[] args) {
		// Declare String object and assign my name to it
		String myName;
		myName = "Matthew Laughlin";
		
		// Print out myName string
		System.out.println("The input string: " + myName);
		
		// Print out length of myName string with length() function
		System.out.println("The number of characters in the string: " + myName.length());
		
		// Print out the first and second characters of the myName string
		System.out.println("The first character in the string is " + myName.charAt(0) + 
				" and the last character is " + myName.charAt(1));
		
		// Print out the myName string in all caps
		System.out.println("The string in uppercase: " + myName.toUpperCase());
		
		// Print the myName string with the letter 'a' replaced with '%'
		System.out.println("The string with the letter 'a' replaced with '%' is: " + myName.replace('a', '%'));
		
		// Print out the first and last occurrences of the letter 'n' in the myName string
		System.out.println("First occurrence of 'n': " + myName.indexOf('n'));
		System.out.println("Last occurrence of 'n': " + myName.lastIndexOf('n'));
	}

}
