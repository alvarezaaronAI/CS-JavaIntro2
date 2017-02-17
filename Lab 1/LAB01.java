/*
 * Aaron Alvarez
 * Lab01
 * CS2012-3
 * Due:9.2.2016
*/
import java.util.Scanner;

public class LAB01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copy the array 
		double[] copiedArray = createarrayDouble();
		//print out the original 
		printArray1D(copiedArray);
		//squared rooted array double using the original array
		squareArrayDouble(copiedArray);
		//check for maxed values in the array and replace.
		arrayCheckerMax(copiedArray);
		//print out and replace the array with its reciprical
		printArray1D(recipricalOfArrays(copiedArray));
	}
		//Array With 10 Values
	public static double[] createarrayDouble()   {
		//creating an array with 10 spaces
		//Ask a question and get the values of the user
		System.out.println("Give me 10 value to enter to the Array: ");
		//replace the default values using the users input
		
		double[] arrayDouble = new double[10];
		Scanner in = new Scanner(System.in);
			for ( int i = 0; i < arrayDouble.length; i++){
				arrayDouble[i] = in.nextDouble();
			}
		System.out.println("Original Array is : ");
		return arrayDouble;
		
	}
		//Write a method that squares the values inside the array and displays it.
	public static void squareArrayDouble ( double[] arrayDoubleItSelf) {
		System.out.println();
		System.out.println("");
		System.out.println("Values of the Array Squared are: ");
		for ( int i = 0; i < arrayDoubleItSelf.length; i++){
			System.out.print(Math.sqrt(arrayDoubleItSelf[i]) + " ");
			
		}
		System.out.println("");
	}
		//Write a method that checks at the array and replaces any value exceeding 500 with 500
	public static void arrayCheckerMax ( double [] arrayDoubleItSelf) {
		System.out.println("");
		System.out.println("Checking for any values exceeding 500 in the array...and replacing with 500.");
		for ( int i = 0; i < arrayDoubleItSelf.length; i++) {
		//Statement checking for exceeding values
			//System.out.print(arrayDoubleItSelf[i] + " ");
			boolean checkForExceedingValue = arrayDoubleItSelf[i] > 500.00;
			if (checkForExceedingValue) {
				arrayDoubleItSelf[i] = 500.00;
			}
			System.out.print(arrayDoubleItSelf[i] + " ");
		}
		System.out.println("");
	}
		//write a method that gets all the values of the array and changes it by its reciprical
	public static double[] recipricalOfArrays ( double[] arrayDoubleItSelf) {
		System.out.println("");
		System.out.println("Getting the values inside array and chaging them to its reciprical ");
		for ( int i = 0; i < arrayDoubleItSelf.length; i++) {
			arrayDoubleItSelf[i] = 1/arrayDoubleItSelf[i];
		}
		return arrayDoubleItSelf;
	}	
		//Method that prints out and array double.
	public static void printArray1D ( double[] arrayDoubleItSelf){
		for ( int i = 0; i < arrayDoubleItSelf.length; i++){
			System.out.print(arrayDoubleItSelf[i]+ " ");
			
		}
	}
}