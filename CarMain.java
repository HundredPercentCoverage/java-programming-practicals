/**
 * 
 */
package carfactory;

/**
 * Main class to demonstrate the Car class from Part 4 of the OOP practical
 * @author ML
 *
 */
public class CarMain {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Create car with explicit constructor
		Car ford = new Car("Ford", "Fiesta", "Blue", 4, 1.2, 110);
		
		// Create car with base constructor
		Car peugeot = new Car();
		
		// Set parameters
		peugeot.setMake("Peugeot");
		peugeot.setModel("308");
		peugeot.setColour("Silver");
		peugeot.setNumberOfDoors(4);
		peugeot.setEngineSize(1.8);
		peugeot.setMaxSpeed(130);
		
		// One more car
		Car ferrari = new Car("Ferrari", "F4", "Red", 2, 2.8, 230);
		
		// Print to console
		System.out.println(ford.toString());
		System.out.println(peugeot.toString());
		System.out.println(ferrari.toString());

	}

}
