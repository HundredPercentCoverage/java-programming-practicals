/**
 * 
 */
package flightcontrol;

/**
 * Flight control class that makes use of the Flight class
 * @author ML
 *
 */
public class AirTrafficControl {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newark", 8.5);

		Flight[] flights = { f1, f2, f3, f4 };
		Flight longestFlight = f1;
		
		for (int count = 0; count < flights.length; count++) {
			System.out.println(flights[count].toString());
			
			if(flights[count].getDuration() > longestFlight.getDuration()) {
				longestFlight = flights[count];
			}
		}
		
		System.out.println("The longest flight is " + longestFlight.getFlightNumber() + " at " + longestFlight.getDuration());
		
		System.out.println("Flights to Dublin...");
		
		for (int count = 0; count < flights.length; count++) {
			if(flights[count].getDestination() == "Dublin") {
				System.out.println(flights[count].getFlightNumber());
			}
		}
		
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);
		
		System.out.println(f5.toString());

	}

}
