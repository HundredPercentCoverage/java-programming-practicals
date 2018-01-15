package hospitalpayroll;
/**
 * 
 */

/**
 * Base employee class
 * @author ML
 *
 */
public abstract class Employee {
	
	private String firstName, lastName;
	private double baseRate;

	/**
	 * Default constructor
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	/**
	 * Calculates employee's weekly salary
	 * @param hours The number of hours the employee has worked (double)
	 */
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f = £%.2f\n", this.firstName, this.lastName,
				"Base rate employee", hours, this.baseRate, (this.baseRate * hours));
	}
	
	/**
	 * Prints all details of employee to screen
	 */
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f\n", "Employee", this.firstName, this.lastName, this.baseRate);
	}

}
