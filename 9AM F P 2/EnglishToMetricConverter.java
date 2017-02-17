package Conversion;

public class EnglishToMetricConverter implements ScaleConverter {
	//intances
	private double temp;
	private double distance;
	private double weight;
	
	//constructor
	public EnglishToMetricConverter(double temp, double distance, double weight) {
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
	public double convertTemperature(double tempIn) {
		double celcius = (tempIn - 32) * (5/9);
		return celcius;
	}

	public double convertDistance(double distanceIn) {
		double KM = distanceIn/.609;
		return KM;
	}

	public double convertWeight(double weightIn) {
		double KG = 2.2 * weightIn;
		return KG;
	}
	//to string, just information about the Object
	@Override
	public String toString() {
		return "EnglishToMetricConverter Celcius=" + temp + " C, KM=" + distance + " km, KG=" + weight + " kg";
	}
	
	

}
