/**
 * 
 */
package flightcontrol;

/**
 * Class to model a particular flight
 * @author ML
 *
 */
public class Flight {
	private String flightNumber, destination, origin;
	private double duration;

	/**
	 * Default constructor
	 */
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Full constructor
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		this.setFlightNumber(flightNumber);
		this.setDestination(destination);
		this.setOrigin(origin);
		this.setDuration(duration);
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		if (duration <= 18.0) {
			this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Sorry, that is an invalid duration.");
			System.out.println("Setting duration to 0...");
		}
	}
	
	/**
	 * Returns a String of the flight details
	 */
	public String toString() {
		return (this.getFlightNumber() + " " + this.getDestination() + " " + this.getOrigin() + " " + this.getDuration());
	}

}
