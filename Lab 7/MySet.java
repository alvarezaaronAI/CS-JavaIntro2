/*
 * Aaron Alvarez
 * Lab 7 MySet
 * */
package Lab7;

import java.util.Arrays;

public class MySet implements MyMath<MySet> {
	// -----------------------------------------------------------------
	// instance
	// -----------------------------------------------------------------
	private int[] refTheArrayItSelf;
	// -----------------------------------------------------------------
	// constructor
	// -----------------------------------------------------------------

	public MySet(int[] refTheArrayItSelfIn) {
		// Make two copies Arrays so that i can modify the actual Arrays.
		int[] copiedArray = refTheArrayItSelfIn;
		int[] copiedArray2 = new int[copiedArray.length];
		// keep track of the COPIED ARRAY FINAL INDEX
		int copiedArray2FinalIndex = 0;
		// for loop that goes through the first COPIED ARRAY and modifies any
		// duplicate to -1 (-1 is the key to remove duplicates)
		for (int i = 0; i < copiedArray.length; i++) {
			int store = copiedArray[i];
			copiedArray2[copiedArray2FinalIndex++] = store;
			for (int j = 0; j < copiedArray.length; j++) {
				if (store == copiedArray[j]) {
					copiedArray[j] = -1;
				}
			}
		}
		// get the size for the ARRAY FINAL by counting the non duplicates (-1)
		int arrayFinalSize = 0;
		for (int i = 0; i < copiedArray2.length; i++) {
			if (copiedArray2[i] != -1) {
				arrayFinalSize++;
			}
		}
		/*
		 * once you get the size store the ARRAY FINAL Index in an in and create
		 * a ARRAY FINAL that contains the non duplicates
		 */
		// This keeps track of the index of the FINAL ARRAY
		int arrayFinalIndex = 0;
		// this final array contains the non duplicates
		int[] arrayFinal = new int[arrayFinalSize];
		for (int i = 0; i < copiedArray.length; i++) {
			if (copiedArray2[i] != -1) {
				arrayFinal[arrayFinalIndex++] = copiedArray2[i];
			}
		}
		// return an reference of non duplicate arrays
		this.refTheArrayItSelf = arrayFinal;

	}
	// -----------------------------------------------------------------
	// getters and setters
	// -----------------------------------------------------------------
	
	public int[] getRefToArrayItSelf() {
		return refTheArrayItSelf;
	}

	public void setRefToArrayItSelf(int[] refToArrayItSelf) {
		this.refTheArrayItSelf = refToArrayItSelf;
	}

	// -----------------------------------------------------------------
	// methods
	// -----------------------------------------------------------------

	@Override
	public MySet add(MySet o) {
		// Take in 2 arrays that will add
		// first Array
		int[] addArrayO = refTheArrayItSelf;
		// second array
		int[] addedArrayO = o.refTheArrayItSelf;
		// take in their lengths
		int sizeOfAddArrayO = addArrayO.length;
		int sizeOfAddedArrayO = addedArrayO.length;
		// Create a FINAL ARRAY
		int[] finalArray = new int[sizeOfAddArrayO + sizeOfAddedArrayO];
		// take index of the FINAL ARRAY to keep track of the array index
		int indexFinalArray = 0;
		/*
		 * do a loop that will go through every FIRST ARRAY added it to the next
		 * Available space in the FINAL ARRAY
		 */
		for (int i = 0; i < addArrayO.length; i++) {
			finalArray[indexFinalArray++] = addArrayO[i];
		}
		/*
		 * do a loop that will go through every SECOND ARRAY added it to the
		 * next Available space in the FINAL ARRAY
		 */
		for (int i = 0; i < addedArrayO.length; i++) {
			finalArray[indexFinalArray++] = addedArrayO[i];
		}
		/*
		 * now that you have your FINAL ARRAY added now take out any duplicates
		 * in the FINAL ARRAY Using the constructor code
		 */
		int[] copiedArray = finalArray;
		int[] copiedArray2 = new int[copiedArray.length];
		int arrayCopiedFinalLength = 0;
		for (int i = 0; i < copiedArray.length; i++) {
			int store = copiedArray[i];
			copiedArray2[arrayCopiedFinalLength++] = store;
			for (int j = 0; j < copiedArray.length; j++) {
				if (store == copiedArray[j]) {
					copiedArray[j] = -1;
				}
			}
		}
		int arrayFinalSize = 0;
		for (int i = 0; i < copiedArray2.length; i++) {
			if (copiedArray2[i] != -1) {
				arrayFinalSize++;
			}
		}
		int arrayFinalIndex = 0;
		int[] arrayFinal = new int[arrayFinalSize];
		for (int i = 0; i < copiedArray.length; i++) {
			if (copiedArray2[i] != -1) {
				arrayFinal[arrayFinalIndex++] = copiedArray2[i];
			}
		}
		MySet FinalAddedArray = new MySet(arrayFinal);
		return FinalAddedArray;

	}

	@Override
	public MySet subtract(MySet o) {
		// Take in 2 arrays that will subtract
		// first Array
		int[] subtractArrayO = refTheArrayItSelf;
		// second array
		int[] subtracetedArrayO = o.refTheArrayItSelf;
		// add a counter that will keep track of the length for the FINAL ARRAY
		int countFinalArraySize = 0;
		/*
		 * for loop that will check for any duplicates and count how many
		 * uniques there are
		 */
		for (int i = 0; i < subtractArrayO.length; i++) {
			int key = subtractArrayO[i];
			int count = 0;

			for (int j = 0; j < subtracetedArrayO.length; j++) {
				if (key == subtracetedArrayO[j]) {
					count++;
				}
			}
			if (count == 0) {
				countFinalArraySize++;
			}
		}
		/*
		 * create a new ARRAY FINAL that contains the length of
		 * countFinalArraySize
		 */
		int[] arrayFinal = new int[countFinalArraySize];
		// create a int that keeps track fo the ARRAY FINAL index
		int arrayFinalIndex = 0;
		/*
		 * for loop will check for duplicates between subtractArrayO and
		 * subtractedArrayO and only return the numbers that subtractArrayO
		 * doesnt have in subtractEDArrayO
		 */
		for (int i = 0; i < subtractArrayO.length; i++) {
			int key = subtractArrayO[i];
			int count = 0;
			for (int j = 0; j < subtracetedArrayO.length; j++) {
				if (key == subtracetedArrayO[j]) {
					count++;
				}
			}
			if (count < 1) {
				arrayFinal[arrayFinalIndex++] = subtractArrayO[i];
			}
		}
		// create a new object containing that arrayFinal
		MySet FinalSubtractedArray = new MySet(arrayFinal);
		// return the final Object
		return FinalSubtractedArray;
	}

	@Override
	public MySet multiply(MySet o) {
		// Take in 2 arrays that will subtract
		// first Array
		int[] multiplyArrayO = refTheArrayItSelf;
		// second array
		int[] multipliedArrayO = o.refTheArrayItSelf;
		/*
		 * add a counter that will be eventually the Final Length make a new
		 * array that contains first and second array
		 */
		//the length of first and second array to create my new array
		int lengthOfArray1And2 = multiplyArrayO.length + multipliedArrayO.length;
		int[] finalMultipliedArrayO = new int[lengthOfArray1And2];
		
		// keep track of FINALMULTIPLIEDARRAYO index it self
		int indexTracker = 0;
		// make a loop that adds every first and second array to this FINALMULTIPLIEDARRAYO
		for (int i = 0; i < multiplyArrayO.length; i++) {
			finalMultipliedArrayO[indexTracker++] = multiplyArrayO[i];
		}
		for (int i = 0; i < multipliedArrayO.length; i++) {
			finalMultipliedArrayO[indexTracker++] = multipliedArrayO[i];
		}
		/*
		 * now that we have FINALMULTIPLIEDARRAYO with duplicates, we can now
		 * delete the duplicates using the code in the bottom
		 */
		int countFinalArraySize = 0;
		for (int i = 0; i < finalMultipliedArrayO.length; i++) {
			int key = finalMultipliedArrayO[i];
			int count = 0;
			for (int j = 0; j < finalMultipliedArrayO.length; j++) {
				if (key == finalMultipliedArrayO[j]) {
					count++;
				}
			}
			if (count < 2) {
				countFinalArraySize++;
			}
		}
		/*
		 * now that you have the length now create a Final Array with that same
		 * length
		 */
		int[] arrayFinal = new int[countFinalArraySize];
		// get the index of the final array and keep track of it
		int arrayFinalIndex = 0;
		/*
		 * create a for loop that goes through both arrays but instead of
		 * searching for the length search for duplicates and erase them
		 */
		for (int i = 0; i < finalMultipliedArrayO.length; i++) {
			int key = finalMultipliedArrayO[i];
			int count = 0;
			for (int j = 0; j < finalMultipliedArrayO.length; j++) {
				if (key == finalMultipliedArrayO[j]) {
					count++;
				}
			}
			if (count < 2) {
				arrayFinal[arrayFinalIndex++] = finalMultipliedArrayO[i];
			}
		}
		// create a new object containing that arrayFinal
		MySet FinalMultipliedArray = new MySet(arrayFinal);
		// return the final Object
		return FinalMultipliedArray;
	}

	@Override
	public MySet divide(MySet o) {
		// Take in 2 arrays that will subtract
		// first Array
		int[] divideArrayO = refTheArrayItSelf;
		// second array
		int[] dividedArrayO = o.refTheArrayItSelf;
		/*
		 * add a counter that will be eventually the Final Length make a new
		 * array that contains first and second array
		 */
		//the length of first and second array to create my new array
		int lengthOfArray1And2 = divideArrayO.length + dividedArrayO.length;
		int[] finalDividedArrayO = new int[lengthOfArray1And2];
		// keep track of FINALDIVIDEDARRAYO index it self
		int indexTracker = 0;
		// make a loop that adds every first and second array to this FINALDIVIDEDARRAYO
		for (int i = 0; i < divideArrayO.length; i++) {
			finalDividedArrayO[indexTracker++] = divideArrayO[i];
		}
		for (int i = 0; i < dividedArrayO.length; i++) {
			finalDividedArrayO[indexTracker++] = dividedArrayO[i];
		}
		/*
		 * now that you added both arrays now lets strip out
		 * every unique number and only have duplicates
		 * example if array a = {1 2 3} & array b = {1 2 4}
		 * added array should be {1 2 3 1 2 4} and my goal is { 1 2 1 2}
		 * stripping out the non duplicates.
		 */
		//this code counts how many duplicates are there and keeps it so then i can use it to 
		int countFinalArraySize = 0;
		for (int i = 0; i < finalDividedArrayO.length; i++) {
			int key = finalDividedArrayO[i];
			int count = 0;
			for (int j = 0; j < finalDividedArrayO.length; j++) {
				if (key == finalDividedArrayO[j]) {
					count++;
				}
			}
			if (count >= 2) {
				countFinalArraySize++;
			}
		}
		/*
		 * now that you have the length now create a Final Array with that same
		 * length
		 */
		int[] arrayFinal = new int[countFinalArraySize];
		// get the index of the final array and keep track of it
		int arrayFinalIndex = 0;
		/*
		 * create a for loop that goes through FINALDIVDEDARRAYO but instead of
		 * searching for the length it keeps the duplicates and erases the nonduplicates
		 */
		for (int i = 0; i < finalDividedArrayO.length; i++) {
			int key = finalDividedArrayO[i];
			int count = 0;
			for (int j = 0; j < finalDividedArrayO.length; j++) {
				if (key == finalDividedArrayO[j]) {
					count++;
				}
			}
			if (count >= 2) {
				arrayFinal[arrayFinalIndex++] = finalDividedArrayO[i];
			}
		}
		// create a new object containing that arrayFinal
		MySet FinalDividedArray = new MySet(arrayFinal);
		// return the final Object
		return FinalDividedArray;
	}

	// -----------------------------------------------------------------
	// toString
	// -----------------------------------------------------------------

	@Override
	public String toString() {
		return Arrays.toString(refTheArrayItSelf);
	}

	// -----------------------------------------------------------------

}