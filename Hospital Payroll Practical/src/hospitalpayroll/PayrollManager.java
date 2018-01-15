package hospitalpayroll;
/**
 * Managing an array of Employee objects
 * @author ML
 *
 */
public class PayrollManager {
	
	public static Employee[] employees; // Array of Employee objects
	
	public static final double HOURS_PER_WEEK = 35;
	
	/**
	 * Default constructor
	 */
	public PayrollManager() {
		
	}
	
	/**
	 * Adds an employee to the array provided that space is not occupied already. If so, it will not be added.
	 * @param e Employee to add
	 */
	public static void addEmployeeToList(Employee e) {
		boolean added = false;
		
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				employees[loop] = e;
				added = true;
				break;
			}
		}
		
		if (!added) {
			System.out.println("The employee was not added...");
		}
	}
	
	/**
	 * Displays the information for all employees in the array
	 */
	public static void displayAllEmployees() {
		int num = 0;
		System.out.println("Display all employees___________________________________");
		System.out.printf("[%-10s] %-20s %-20s %-6s Other\n", "Type", "First Name", "Last Name", "Rate");
		for (Employee e : employees) {
			if (e != null) {
				e.printAll();
				num++;
			}
		}
		System.out.println("Total employees in system : " + num);
		System.out.println();
	}
	
	/**
	 * Displays the weekly salary for all employees in the array
	 */
	public static void processWeeklyPayroll() {
		int num = 0;
		for (Employee e : employees) {
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				num++;
			}
		}
		System.out.println("Total records processed : " + num);
		System.out.println();
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			employees = new Employee[6];
			
			Porter p1 = new Porter("Ivana", "Patient", 10.5, "Royal");
			Porter p2 = new Porter("Amanda", "Pushabed", 10.5, "BCH");
			Surgeon s1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650);
			Surgeon s2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800);
			Pharmacist ph1 = new Pharmacist("Poppy", "Pill", 30.5, 7, 750);
			
			addEmployeeToList(p1);
			addEmployeeToList(p2);
			addEmployeeToList(s1);
			addEmployeeToList(s2);
			addEmployeeToList(ph1);	
			
			displayAllEmployees();
			processWeeklyPayroll();
			
			System.out.println("Surgeon : admin controlled drug : " + s1.adminControlledDrug());
			System.out.println("Surgeon : admin noncontrolled drug : " + s1.adminNoncontrolledDrug());
			
			System.out.println("Pharmacist : admin controlled drug : " + ph1.adminControlledDrug());
			System.out.println("Pharmacist : admin noncontrolled drug : " + ph1.adminNoncontrolledDrug());
			
		} catch (Exception e) {
			System.out.println("Error...");
			e.printStackTrace();
		} finally {
			System.out.println("Program ending...");
		}
		
	}

}
