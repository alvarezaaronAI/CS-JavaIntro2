package Conversion;

public class MetricToEnglishConverter implements ScaleConverter{
	private double temp;
	private double distance;
	private double weight;
	
	//constructor
	public MetricToEnglishConverter(double temp, double distance, double weight) {
		super();
		this.temp = temp;
		this.distance = distance;
		this.weight = weight;
	}
	//getters and setters
	
	

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	//implement methods from ScaleConverter interface
	@Override
		public double convertTemperature(double tempIn) {
			double fahrenheit = 32+(tempIn*(9/5));		
			return fahrenheit;
		}
	@Override
	public double convertDistance(double distanceIn) {
		double miles = .609 * distanceIn;
		return miles;
	}

	@Override
	public double convertWeight(double weightIn) {
		double pounds = weightIn/2.2;
		return pounds;
	}
	//toString information about the object
	@Override
	public String toString() {
		return "MetricToEnglishConverter Fahrenheit =" + temp + " F, Miles=" + distance + " m, Pounds=" + weight + " p";
	}
	

}
