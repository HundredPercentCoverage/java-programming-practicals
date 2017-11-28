/**
 * 
 */
package vehicles;

/**
 * @author ML
 *
 */
public class Car extends Vehicle {
	private int numberOfWheels;

	public Car() {
		
	}

	/**
	 * @param name
	 * @param powerType
	 */
	public Car(String name, String powerType, int numberOfWheels) {
		super(name, powerType);
		this.numberOfWheels = numberOfWheels;
	}

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [name=" + getName() + ", PowerType=" + getPowerType() + ", numberOfWheels="
				+ numberOfWheels + "]";
	}

	
	
}
