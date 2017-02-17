package Lab5;

public class Address {
	private int streetNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private String countryName;

	public Address(int streetNumberIn, String streetNameIn, String cityNameIn, String stateNameIn,
	String countryNameIn) {
		streetNumber = streetNumberIn;
		streetName = streetNameIn;
		cityName = cityNameIn;
		stateName = stateNameIn;
		countryName = countryNameIn;
		

	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Address is : " + streetNumber + " " + streetName + " " + cityName
				+ " " + stateName + ", " + countryName ;

	}
}

