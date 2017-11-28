/**
 * 
 */
package vehicles;

/**
 * @author ML
 *
 */
public class Ship extends Vehicle{
	private int tonnage;

	/**
	 * 
	 */
	public Ship() {
		
	}

	/**
	 * @param name
	 * @param powerType
	 */
	public Ship(String name, String powerType, int tonnage) {
		super(name, powerType);
		this.tonnage = tonnage;
	}

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ship [name=" + getName() + ", PowerType=" + getPowerType() + ", tonnage=" + tonnage + "]";
	}
	
	

}
