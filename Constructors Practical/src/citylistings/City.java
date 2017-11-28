/**
 * 
 */
package citylistings;

/**
 * @author ML
 *
 */
public class City {
	// Instance vars
	private String cityName, country;
	private int population;
	private boolean countryCapital;

	// Constructors
	
	/**
	 * Default constructor
	 */
	public City() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Full constructor
	 * @param cityName
	 * @param country
	 * @param population
	 * @param countryCapital
	 */
	public City(String cityName, String country, int population, boolean countryCapital) {
		this.cityName = cityName;
		this.country = country;
		this.setPopulation(population);
		this.countryCapital = countryCapital;
	}
	
	// Getters and setters

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		if (population > 0 && population <= 50) {
			this.population = population;
		} else {
			System.out.println("Sorry, that's not a valid population. Setting to default (1)");
			this.population = 1;
		}
	}

	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	// Instance methods
	
	/**
	 * Return string of all city info
	 */
	public String toString() {
		return (this.cityName + " " + this.population + " " + this.countryCapital + " " + this.country);
	}

}
