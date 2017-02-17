package Lab5;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private String courseTitle;
	private List<Course> courses = new ArrayList<Course>();

	public Course(String courseNameIn, String courseTitleIn) {
		courseName = courseNameIn;
		courseTitle = courseTitleIn;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "(" + getCourseName() + ")" + getCourseTitle();
	}

}
