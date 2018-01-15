package hospitalpayroll;
/**
 * 
 */

/**
 * Surgeon employee class
 * @author ML
 *
 */
public class Surgeon extends Employee implements AdministerDrugs {

	private String specialistArea;
	private double consultationFee;

	/**
	 * Default constructor
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Contructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea
	 *            the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee
	 *            the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	/**
	 * Calculates the weekly salary for the Surgeon
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f\n", this.getFirstName(),
				this.getLastName(), "Surgeon", hours, this.getBaseRate(), this.consultationFee,
				(this.getBaseRate() * hours + this.consultationFee));
	}

	/**
	 * Displays all info on the surgeon
	 */
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Specialist Area : %s, Consultation Fee :£%.2f\n", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.specialistArea, this.consultationFee);
	}

	/**
	 * Returns whether the employee can administer a controlled drug or not
	 */
	@Override
	public boolean adminControlledDrug() {
		return false;
	}

	/**
	 * Returns whether the employee can administer a non-controlled drug or not
	 */
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}

}
