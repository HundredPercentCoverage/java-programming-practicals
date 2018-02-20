package students;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Messing with ArrayLists and Iterators
 * @author ML
 *
 */
public class Main {

	/**
	 * Prints the details of the Students in the list via an enhanced for loop
	 * @param students The students to print
	 */
	public static void printStudents(ArrayList<Student> students) {
		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("Number of students: " + students.size());
	}

	/**
	 * Prints the details of the Students in the list via an iterator
	 * @param students The students to print
	 */
	public static void printStudentsIterator(ArrayList<Student> students) {
		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Number of students: " + students.size());
	}

	/**
	 * Calculates the average age of the students in the list.
	 * @param students The Student objects to gather age information from.
	 * @return The average age of all students in the list
	 */
	public static double averageAge(ArrayList<Student> students) {
		int total = 0;
		for (Student s : students) {
			total += s.getAge();
		}
		System.out.printf("Average age of all students: %.2f\n\n", (double) total / students.size());
		return (double) total / students.size();
	}

	/**
	 * Returns an ArrayList of type Student with those under the average age filtered out
	 * @param students The Students to filter
	 * @param averageAge The average age by which to filter the students
	 * @return The students above the average age
	 */
	public static ArrayList<Student> aboveAverageAge(ArrayList<Student> students, double averageAge) {
		Iterator<Student> it = students.iterator();
		Student s;

		while (it.hasNext()) {
			s = it.next();
			if (s.getAge() < averageAge) {
				it.remove();
			}
		}
		return students;
	}

	/**
	 * Merges two lists of students without duplication.
	 * @param databasesList First list to merge
	 * @param programmingList Second list to merge
	 * @return Merged list of Students (no duplicates)
	 */
	public static ArrayList<Student> merge(ArrayList<Student> databasesList, ArrayList<Student> programmingList) {
		ArrayList<Student> mergedList = databasesList;
		
		for(Student s : programmingList) {
			if (!mergedList.contains(s)) {
				mergedList.add(s);
			}
		}
		
		return mergedList;
	}
	/**
	 * Writes the given list of Students to a file
	 * @param studentList The list to write to the file.
	 */
	public static void writeFile(ArrayList<Student> studentList) {
		try {
			String separator = System.lineSeparator();
			File file = new File("class_report.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter b = new BufferedWriter(fw);
			
			for(Student s : studentList) {
				b.write("First name: " + s.getFirstName() + separator);
				b.write("Last name: " + s.getLastName() + separator);
				b.write("Age: " + s.getAge() + separator);
				b.write("Student number: " + s.getStudentNumber() + separator);
				b.newLine();
			}
			
			b.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ArrayList<Student> databaseClass = new ArrayList<Student>();
	
			Student s1 = new Student("Joe", "Bloggs", 31, 1234567);
			Student s2 = new Student("Jimi", "Hendrix", 35, 11111111);
			Student s3 = new Student("Carole", "King", 27, 458349583);
			Student s4 = new Student("Jimmy", "Wales", 28, 87934534);
			Student s5 = new Student("James", "Dean", 25, 8425475);
			Student s6 = new Student("Jennifer", "Lawrence", 23, 1344534);
	
			databaseClass.add(s1);
			databaseClass.add(s2);
			databaseClass.add(s3);
			databaseClass.add(s4);
			databaseClass.add(s5);
			databaseClass.add(s6);
	
			ArrayList<Student> programmingClass = new ArrayList<Student>();
	
			Student p1 = new Student("Jimmy", "Nail", 54, 92485);
			Student p2 = new Student("Hank", "Hill", 55, 2985394);
			Student p3 = new Student("Beavis", "Butthead", 17, 23432);
	
			programmingClass.add(p1);
			programmingClass.add(p2);
			programmingClass.add(p3);
			programmingClass.add(s1);
	
			// printStudents(students);
			//printStudentsIterator(databaseClass);
			//double averageAge = averageAge(databaseClass);
			//System.out.println("Students above the average age...");
			//printStudentsIterator(aboveAverageAge(databaseClass, averageAge));
			
			System.out.println("Merged list...");
			printStudents(merge(databaseClass, programmingClass));
			
			System.out.println("Writing merged list to file...");
			writeFile(merge(databaseClass, programmingClass));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
