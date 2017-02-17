package Lab5;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private int cINNumber;
	private List<Course> courseScheduals = new ArrayList<Course>();
	
	public Student(int streetNumberIn, String streetNameIn, String cityNameIn, String stateNameIn, String countryNameIn,
			String personNameIn, int cINNumberIn ) {
		super(streetNumberIn, streetNameIn, cityNameIn, stateNameIn, countryNameIn, personNameIn);
		cINNumber = cINNumberIn;
	}
	
	public int getcINNumber() {
		return cINNumber;
	}
	public void setcINNumber(int cINNumber) {
		this.cINNumber = cINNumber;
	}

	public void setCourseScheduals(List<Course> courseScheduals) {
		this.courseScheduals = courseScheduals;
	}
	public Course getCourses(int i){
		return courseScheduals.get(i);
	}
	public void addingCourse(Course course){
		courseScheduals.add(course);
	}
	public void removeCourse(Course course){
		courseScheduals.remove(course);
	}
	@Override
	public String toString() {
		return  getPersonName() +" is " + getStreetNumber() + " " + getStreetName() + " " + getCityName()
				+ " " + getStateName() + ", " + getCountryName() + " and CIN is " + getcINNumber() + courseScheduals;  
	}

}
