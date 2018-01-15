package hospitalpayroll;
/**
 * 
 */

/**
 * Porter employee class
 * @author ML
 *
 */
public class Porter extends Employee {

	private String site;

	/**
	 * Default constructor
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param site
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site
	 *            the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * Displays the information for the Porter
	 */
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Site : %s\n", "Porter", this.getFirstName(), this.getLastName(),
				this.getBaseRate(), this.site);
	}

}
