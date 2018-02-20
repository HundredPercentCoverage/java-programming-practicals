package students;

public class Student {

	private String firstName, lastName;
	private int age, studentNumber;

	public Student() {

	}

	public Student(String firstName, String lastName, int age, int studentNumber) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setStudentNumber(studentNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "First name: " + this.firstName + "\nLast name: " + this.lastName + "\nAge: " + this.age
				+ "\nStudent number: " + this.studentNumber + "\n";

	}

}
