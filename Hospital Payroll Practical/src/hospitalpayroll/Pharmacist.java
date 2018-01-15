package hospitalpayroll;
/**
 * 
 */

/**
 * Pharmacist employee class
 * @author ML
 *
 */
public class Pharmacist extends Employee implements AdministerDrugs {

	private int grade;
	private double bonus;

	/**
	 * Default constructor
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param grade
	 * @param bonus
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/**
	 * Calculates the weekly salary for the Pharmacist
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f\n", this.getFirstName(),
				this.getLastName(), "Pharmacist", hours, this.getBaseRate(), this.bonus,
				(this.getBaseRate() * hours + this.bonus));
	}

	/**
	 * Displays all info on the pharmacist
	 */
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus : £%.2f\n", "Porter", this.getFirstName(),
				this.getLastName(), this.getBaseRate(), this.grade, this.bonus);
	}
	
	/**
	 * Returns whether the employee can administer a non-controlled drug or not
	 */
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}
	
	/**
	 * Returns whether the employee can administer a controlled drug or not
	 */
	@Override
	public boolean adminControlledDrug() {
		return true;
	}

}
