package uk.ac.qub.secondpractical;

public class PartThree {

	public static void main(String[] args) {
		// Calculate the area of a square with given side length squareSide
		int squareSide = 6; // Set length of square side to 6
		int squareArea = squareSide * squareSide;
		System.out.println("Square with side length 6 area is: " + squareArea); // Print answer
		
		// Calculate the area of a circle of given radius to two decimal places
		double radius = 9.0;
		double area = 3.142 * radius * radius;
		System.out.printf("Area of circle with radius of 9 is: %.2f\n", area); // Print answer
		
		// Define two ints and compare them to determine which is greater, or if they are equal
		int number1 = 30;
		int number2 = 30;
		
		if(number1 > number2) {
			System.out.printf("%d\n", number1); // Will print if number1 is greater
		} else if(number1 < number2) {
			System.out.printf("%d\n", number2); // Will print if number2 is greater
		} else {
			System.out.println("Both numbers are equal"); // Will print if both are equal
		}
		
		// Declare ints for different ages and calculate their respective values
		int yearOfBirth, yearWhenITurn21, yearWhenITurn40, yearWhenIRetireAt60;
		yearOfBirth = 1982;
		yearWhenITurn21 = yearOfBirth + 21;
		yearWhenITurn40 = yearOfBirth + 40;
		yearWhenIRetireAt60 = yearOfBirth + 60;
		
		// Print results of above calculations
		System.out.println("Birth	: " + yearOfBirth);
		System.out.println("Turn 21	: " + yearWhenITurn21);
		System.out.println("Turn 40	: " + yearWhenITurn40);
		System.out.println("Retire	: " + yearWhenIRetireAt60);
		
	}

}
