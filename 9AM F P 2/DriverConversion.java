package Conversion;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriverConversion {
	EnglishToMetricConverter englishToMetric1 = new EnglishToMetricConverter(32, 22, 12);
	EnglishToMetricConverter metricToEnglish = new EnglishToMetricConverter(212, 36.1247947454844, 6);
	//englishToMetric
	
	//Testing Temp
	@Test
	public void testTemp() {
		double tempInC=englishToMetric1.convertTemperature(englishToMetric1.getTemp());
		//When fahrenheit is 32 it should be 212c as an answer
		boolean doesItEqual = tempInC ==metricToEnglish.convertTemperature(tempInC);
		assertTrue(doesItEqual);
	
	}
	@Test
	public void testDistance() {
		double distanceInKM = englishToMetric1.convertDistance(englishToMetric1.getDistance());
		boolean doesItEqual = distanceInKM == metricToEnglish.convertDistance(distanceInKM);
		assertTrue(doesItEqual);
	}
	@Test
	public void testWeight(){
		double weightInKG = englishToMetric1.convertWeight(englishToMetric1.getWeight());
		boolean doesItEqual = weightInKG == metricToEnglish.convertWeight(weightInKG);
		System.out.println(weightInKG);
		assertTrue(doesItEqual);
	}
	
}
