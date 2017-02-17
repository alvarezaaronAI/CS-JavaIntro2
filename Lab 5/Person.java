package Lab5;

public class Person extends Address{
	private String personName;
	
	public Person(int streetNumberIn, String streetNameIn, String cityNameIn, String stateNameIn,
			String countryNameIn, String personNameIn) {
		super(streetNumberIn, streetNameIn, cityNameIn, stateNameIn, countryNameIn);
		personName = personNameIn;
	}
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person is " + personName;
	}
	
}
