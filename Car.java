/**
 * 
 */
package carfactory;

/**
 * Class written for Part 4 of the OOP practical
 * @author ML
 *
 */
public class Car {
	// Instance vars
	private String make, model, colour;
	private int numberOfDoors, maxSpeed;
	private double engineSize;
	private boolean started;

	// Instance methods
	
	/**
	 * Constructor
	 */
	public Car(String make, String model, String colour, int numberOfDoors, double engineSize, int maxSpeed) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
		this.maxSpeed = maxSpeed;
		started = false;
	}
	
	public Car() {
		make = "";
		model = "";
		colour = "";
		numberOfDoors = 0;
		engineSize = 0;
		maxSpeed = 0;
		started = false;
	}
	
	/**
	 * Sets the car to started (boolean) if not already running
	 */
	public void startCar() {
		if(started) {
			System.out.println("The car is already running");
		} else {
			started = true;
			System.out.println("The car has been started");
		}
	}
	
	/**
	 * Stops the car (boolean) if the car is running
	 */
	public void stopCar() {
		if(started) {
			started = false;
			System.out.println("The car has been stopped");
		} else {
			System.out.println("The car is already stopped");
		}
	}
	
	/**
	 * Returns a String with the car details
	 */
	public String toString() {
		return (make + ", " + model + ", " + colour + ", " + numberOfDoors + ", " + engineSize + ", " + maxSpeed);
	}
	
	// Getters and setters
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public double getEngineSize() {
		return engineSize;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setStarted(boolean started) {
		if(started) {
			System.out.println("Car running. Stopping now...");
			started = false;
		} else {
			System.out.println("Car not running. Starting car...");
			started = true;
		}
	}
	
	public boolean isStarted() {
		return started;
	}

}
