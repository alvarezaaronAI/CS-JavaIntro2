package Lab5;

import java.util.ArrayList;
import java.util.List;

public class FalcultyMember extends Person {
	
	private int employeeIDNum;
	private List<Course> teachingScheduals = new ArrayList<Course>();
	
	public FalcultyMember(int streetNumberIn, String streetNameIn, String cityNameIn, String stateNameIn,
			String countryNameIn, String personNameIn, int employeeIDNumIn) {
		super(streetNumberIn, streetNameIn, cityNameIn, stateNameIn, countryNameIn, personNameIn);
		employeeIDNum  = employeeIDNumIn;
	}

	public int getEmployeeIDNum() {
		return employeeIDNum;
	}

	public void setEmployeeIDNum(int employeeIDNum) {
		this.employeeIDNum = employeeIDNum;
	}

	public List<Course> getTeachingScheduals() {
		return teachingScheduals;
	}

	public void setTeachingScheduals(List<Course> teachingScheduals) {
		this.teachingScheduals = teachingScheduals;
	}
	public Course getCourses(int i){
		return teachingScheduals.get(i);
	}
	public void addingCourse(Course course){
		teachingScheduals.add(course);
	}
	public void removeCourse(Course course){
		teachingScheduals.remove(course);
	}
	@Override
	public String toString() {
		return getPersonName() +" is " + getStreetNumber() + " " + getStreetName() + " " + getCityName()
		+ " " + getStateName() + ", " + getCountryName() + " and Employee ID is " + getEmployeeIDNum() + teachingScheduals;
	}
	
}
