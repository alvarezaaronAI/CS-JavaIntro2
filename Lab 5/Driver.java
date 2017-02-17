package Lab5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Driver {
	public static List<Student> students = new ArrayList<Student>();
	public static List<FalcultyMember> facultyMembers = new ArrayList<FalcultyMember>();
	public static List<Course> courses = new ArrayList<Course>();

	public static void main(String[] args) {

		{
			String[] choices = { " Quit ", " Students ", " Faculty Members ", " Course ", " Load Test Data" };
			int choice;
			{
				do {
					choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", 0,
							JOptionPane.QUESTION_MESSAGE, null, choices, "null");

					switch (choice) {
					// add conditions here....
					case 0:
						break;
					case 1:
						studentsMethod();
						break;
					case 2:
						FacultiesMethod();
						break;
					case 3:
						courseMethod();
						break;
					case 4:
						testData();
					
					} // end switch

				} while (choice != 0); // end do
			}
		}
	}// end main

	public static void studentsMethod() {
		{
			String[] choices = { " Go To Menu ", " Add Students ", " Delete Students ", " View Students ",
					"Add/Drop Student Of A Course " };
			int choice;
			{
				do {
					choice = JOptionPane.showOptionDialog(null, "Students", "Students Main", 0, JOptionPane.QUESTION_MESSAGE,
							null, choices, "null");

					switch (choice) {
					// add conditions here....
					case 0:
						break;
					case 1:
						addStudents();
						break;
					case 2:
						deleteStudents();
						break;
					case 3:
						listStudents();
						break;
					case 4:
						optionStudent();
					} // end switch

				} while (choice != 0); // end do
			}
		}
	}

	// Methods For Students
	public static void addStudents() {
		int streetNumber = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The Street Number For The Student"));
		String streetName = JOptionPane.showInputDialog("Please Enter The Street Name For The Student");
		String cityName = JOptionPane.showInputDialog("Please Enter The City Name For The Student");
		String stateName = JOptionPane.showInputDialog("Please Enter The State Name For The Student");
		String countryName = JOptionPane.showInputDialog("Please Enter The Country For The Student");
		String personName = JOptionPane.showInputDialog("Please Enter The Name Of The Student");
		int cIN = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The CIN Number For The Student"));

		students.add(new Student(streetNumber, streetName, cityName, stateName, countryName, personName, cIN));
	}

	private static void deleteStudents() {
		int userDeleteStudent = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The CIN of The Student You Want To Delete"));
		for (int i = 0; i < students.size(); i++) {
			if (userDeleteStudent == students.get(i).getcINNumber()) {
				students.remove(i);
			}
		}
	}

	private static void listStudents() {
		StringBuilder sb = new StringBuilder("List of Students \n");
		if (students.isEmpty())
			sb.append("No Students At The Moment");
		else
			for (Student i : students)
				sb.append(i + "\n");
		JOptionPane.showMessageDialog(null, sb);

	}

	private static void optionStudent() {
		{
			String[] choices = { " Go Back ", " Add Student To A Course ", " Delete Student From A Course " };
			int choice;
			{
				do {
					choice = JOptionPane.showOptionDialog(null, "Student", "Adding To Course/DroppingCourse", 0,
							JOptionPane.QUESTION_MESSAGE, null, choices, "null");

					switch (choice) {
					// add conditions here....
					case 0:
						break;
					case 1:
						addStudentCourse();
						break;
					case 2:
						dropStudentCourse();
						break;
					} // end switch

				} while (choice != 0); // end do
			}
		}
	}

	private static void addStudentCourse() {
		String studentAdd = "";
		String studentAdd2 = "";

		for (int i = 0; i < courses.size(); i++) {
			studentAdd = (studentAdd + i + " " + courses.get(i) + "\n");

		}
		for (int i = 0; i < students.size(); i++) {
			studentAdd2 = (studentAdd2 + i + " " + students.get(i) + "\n");
		}

		int userSpecificStudent = Integer
				.parseInt(JOptionPane.showInputDialog(studentAdd2 + "\n Please Enter the Student of your Choice"));
		int selectedCourse = Integer
				.parseInt(JOptionPane.showInputDialog(studentAdd + "\n Please Enter The Course Of Your Choice To Add"));
		students.get(userSpecificStudent).addingCourse(courses.get(selectedCourse));

	}

	private static void dropStudentCourse() {
		String studentRemove = "";
		String studentRemove2 = "";

		for (int i = 0; i < courses.size(); i++) {
			studentRemove = (studentRemove + i + " " + courses.get(i) + "\n");

		}
		for (int i = 0; i < students.size(); i++) {
			studentRemove2 = (studentRemove2 + i + " " + students.get(i) + "\n");
		}

		int userSpecificStudent = Integer
				.parseInt(JOptionPane.showInputDialog(studentRemove2 + "\n Please Enter the Student of your Choice"));
		int selectedCourse = Integer.parseInt(
				JOptionPane.showInputDialog(studentRemove + "\n Please Enter The Course Of Your Choice To Remove"));
		students.get(userSpecificStudent).removeCourse(courses.get(selectedCourse));

	}
	// end of Students Methods

	// Methods For Faculty Members
	private static void FacultiesMethod() {
		{
			String[] choices = { " Go To Menu ", " Add Faculties ", " Delete Faculties ", " View Faculties ",
					"Add/Drop Faculty From A Course" };
			int choice;
			{
				do {
					choice = JOptionPane.showOptionDialog(null, "Faculties", "Faculties Main", 0,
							JOptionPane.QUESTION_MESSAGE, null, choices, "null");

					switch (choice) {
					// add conditions here....
					case 0:
						break;
					case 1:
						addFaculties();
						break;
					case 2:
						deleteFaculties();
						break;
					case 3:
						listFaculties();
						break;
					case 4:
						optionFaculty();
					} // end switch

				} while (choice != 0); // end do
			}
		}
	}

	private static void addFaculties() {
		int streetNumber = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The Street Number For The Faculty"));
		String streetName = JOptionPane.showInputDialog("Please Enter The Street Name For The Faculty");
		String cityName = JOptionPane.showInputDialog("Please Enter The City Name For The Faculty");
		String stateName = JOptionPane.showInputDialog("Please Enter The State Name For The Faculty");
		String countryName = JOptionPane.showInputDialog("Please Enter The Country For The Faculty");
		String personName = JOptionPane.showInputDialog("Please Enter The Name Of The Faculty");
		int employeeIDNum = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The Employee ID Number For The Faculty"));

		facultyMembers.add(new FalcultyMember(streetNumber, streetName, cityName, stateName, countryName, personName,
				employeeIDNum));

	}

	private static void deleteFaculties() {
		int usersDeleteFacultie = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The Employee ID Of Which You Want To Delete"));
		for (int i = 0; i < facultyMembers.size(); i++) {
			if (usersDeleteFacultie == facultyMembers.get(i).getEmployeeIDNum()) {
				facultyMembers.remove(i);
			}
		}
	}

	private static void listFaculties() {
		StringBuilder sb = new StringBuilder("List of Faculties \n");
		if (facultyMembers.isEmpty())
			sb.append("No Faculty Members At The Moment");
		else
			for (FalcultyMember i : facultyMembers)
				sb.append(i + "\n");
		JOptionPane.showMessageDialog(null, sb);

	}

	private static void optionFaculty() {
		{
			String[] choices = { " Go Back ", " Add Faculty To A Course ", " Delete Faculty From A Course " };
			int choice;
			{
				do {
					choice = JOptionPane.showOptionDialog(null, "Faculty", "Adding To Course/Dropping Course", 0,
							JOptionPane.QUESTION_MESSAGE, null, choices, "null");

					switch (choice) {
					// add conditions here....
					case 0:
						break;
					case 1:
						addFacultyCourse();
						break;
					case 2:
						dropFacultyCourse();
						break;
					} // end switch

				} while (choice != 0); // end do
			}
		}
	}

	private static void addFacultyCourse() {
		String facultyAdd = "";
		String facultyAdd2 = "";

		for (int i = 0; i < courses.size(); i++) {
			facultyAdd = (facultyAdd + i + " " + courses.get(i) + "\n");

		}
		for (int i = 0; i < facultyMembers.size(); i++) {
			facultyAdd2 = (facultyAdd2 + i + " " + facultyMembers.get(i) + "\n");
		}

		int userSpecificStudent = Integer
				.parseInt(JOptionPane.showInputDialog(facultyAdd2 + "\n Please Enter the Faculty of your Choice"));
		int selectedCourse = Integer
				.parseInt(JOptionPane.showInputDialog(facultyAdd + "\n Please Enter The Course Of Your Choice To Add"));
		facultyMembers.get(userSpecificStudent).addingCourse(courses.get(selectedCourse));
	}

	private static void dropFacultyCourse() {

	}
	// end of Faculties Method

	// Test Data Method
	private static void testData() {
		students.add(new Student(714, "Burlington", "Los Angeles", "CA", "USA", "Aaron Alvarez", 304745524));
		students.add(new Student(456, "Long Street", "Los Angeles", "CA", "USA", "Mr. Try To Hard", 65161));
		students.add(new Student(654, "Short Steet", "Los Angeles", "CA", "USA", "Joe Dominguez", 165413));
		facultyMembers.add(new FalcultyMember(789, "Square Up", "Los Angeles", "CA", "USA", "The Hulk", 3121));
		facultyMembers.add(new FalcultyMember(987, "BRO Street", "Los Angeles", "CA", "USA", "Coding Bro", 2135));
		facultyMembers.add(new FalcultyMember(321, "Common Street", "Los Angeles", "CA", "USA", "Semore Lang", 3125));
		courses.add(new Course("MA", "Math"));
		courses.add(new Course("CS", "Computer Science"));
		courses.add(new Course("PHYS", "Physics"));
		courses.add(new Course("BIO", "Biology"));
		courses.add(new Course("ENGL", "English"));
	}
	
	// end of Test Data

	// Methods For Course
	private static void courseMethod() {
		String[] choices = { " Go To Menu ", " Add Courses ", " View Courses " };
		int choice;
		{
			do {
				choice = JOptionPane.showOptionDialog(null, "Courses", "Courses", 0, JOptionPane.QUESTION_MESSAGE, null,
						choices, "null");

				switch (choice) {
				// add conditions here....
				case 0:
					break;
				case 1:
					addCourses();
					break;
				case 2:
					listCourses();
					break;
				} // end switch

			} while (choice != 0); // end do
		}
	}

	private static void addCourses() {
		String courseIden = JOptionPane.showInputDialog("Please Enter The Course Identifier");
		String courseName = JOptionPane.showInputDialog("Please Enter The Course Name");

		courses.add(new Course(courseIden, courseName));

	}

	private static void listCourses() {
		StringBuilder sb = new StringBuilder("List of Courses \n");
		if (courses.isEmpty())
			sb.append("No Courses At The Moment");
		else
			for (Course i : courses)
				sb.append(i + "\n");
		JOptionPane.showMessageDialog(null, sb);
	}
	// end of Course Method
}
