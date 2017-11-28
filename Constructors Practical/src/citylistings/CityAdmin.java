/**
 * 
 */
package citylistings;

/**
 * @author ML
 *
 */
public class CityAdmin {

	/**
	 * Show all cities
	 * @param cities
	 */
	public static void displayAll(City[] cities) {
		System.out.println("Displaying all cities...");

		for (City city : cities) {
			System.out.println(city.toString());
		}
		System.out.println();
	}

	/**
	 * Show city with smallest population
	 * @param cities
	 */
	public static void smallestCity(City[] cities) {
		City smallestCity = cities[0];

		for (City city : cities) {
			if (city.getPopulation() < smallestCity.getPopulation()) {
				smallestCity = city;
			}
		}

		System.out.println("The smallest city is " + smallestCity.getCityName() + " with "
				+ smallestCity.getPopulation() + " million people");
		System.out.println();
	}

	/**
	 * Show capital cities
	 * @param cities
	 */
	public static void capitalCitySearch(City[] cities) {
		System.out.println("Capital cities...");
		for (City city : cities) {
			if (city.isCountryCapital()) {
				System.out.println(city.getCityName() + " is the capital of " + city.getCountry());
			}
		}
		System.out.println();
	}
	
	/**
	 * Show cities in given country
	 * @param cities
	 * @param country
	 */
	public static void cityByCountry(City[] cities, String country) {
		System.out.println("Cities in " + country + "...");
		for (City city : cities) {
			if(city.getCountry() == country) {
				System.out.println(city.getCityName());
			}
		}
		System.out.println();
	}
	
	/**
	 * calculate average population of input cities array
	 * @param cities
	 */
	public static void averagePopulation(City[] cities) {
		int total = 0;
		
		System.out.println("Calculating average population of all cities");
		for(City city : cities) {
			total += city.getPopulation();
		}
		
		System.out.printf("Average population of all cities is %.2f\n\n", (double)total / cities.length);
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		City c1 = new City("Beijing", "China", 11, true);
		City c2 = new City("Madrid", "Spain", 5, true);
		City c3 = new City("Rome", "Italy", 6, true);
		City c4 = new City("New York", "USA", 8, false);
		City c5 = new City("Washington", "USA", 2, true);
		City c6 = new City("Dallas", "USA", 3, false);

		City[] cities = { c1, c2, c3, c4, c5, c6 };

		displayAll(cities);
		smallestCity(cities);
		capitalCitySearch(cities);
		cityByCountry(cities, "USA");
		averagePopulation(cities);
	}

}
