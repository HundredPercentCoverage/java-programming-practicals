/**
 * 
 */
package whalewatching;

/**
 * @author ML
 *
 */
public class Whale extends Animal {
	private String mainOcean;
	private int weight, maxSpeed, length;

	/**
	 * 
	 */
	public Whale() {
		super();
	}

	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.setMainOcean(mainOcean);
		this.setWeight(weight);
		this.setMaxSpeed(maxSpeed);
		this.setLength(length);
	}

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}

	/**
	 * @param mainOcean
	 *            the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed
	 *            the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return (this.getName() + " " + this.getMainOcean() + " " + this.getWeight() + " " + this.getMaxSpeed() + " "
				+ this.getLength());
	}

}
