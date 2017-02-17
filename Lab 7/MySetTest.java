/*
 * Kayleen Ponce
 * Lab7 MYSet Test
 * */
package Lab7Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Lab7.MySet;

public class MySetTest {
	
	@Test
	 public void instanceTest() {
	  
	  int [] array1 = {1, 2, 3, 4, 5};
	  
	  MySet mySet1 = new MySet(array1);
	  //should return some type of object
	  assertNotNull(mySet1);
	 }
	@Test
	 public void constructorTest() {
	  
	  int [] array1 = {1, 2, 2, 4, 5};
	  MySet mySet1 = new MySet(array1);
	  //this object should return the same array at the top when constructed
	  String answer = "[1, 2, 4, 5]";
	  assertEquals(mySet1.toString(), answer);
	 }
	
	@Test
	 public void addTest(){
	  int [] firstArray = {1, 2, 3, 4, 5};
	  MySet mySet1 = new MySet(firstArray);
	  int [] secondArray = {5, 6, 7, 8, 9};
	  MySet mySet2 = new MySet(secondArray);
	  MySet add = mySet1.add(mySet2);
	  //should only return the added arrays, no duplicates
	  String answer = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";

	  assertEquals(answer, add.toString());
	 }
	@Test
	 public void subtractTest(){
	  int [] firstArray = {1, 2, 3, 4, 5};
	  MySet mySet1 = new MySet(firstArray);
	  int [] secondArray = {5, 6, 7, 8, 9};
	  MySet mySet2 = new MySet(secondArray);
	  MySet subtract = mySet1.subtract(mySet2);
	  //should only return what array 1 doesnt have in array 1
	  String answer = "[1, 2, 3, 4]";

	  assertEquals(answer, subtract.toString());
	 }
	@Test
	 public void multiplyTest(){
	  int [] firstArray = {1, 2, 3, 4, 5};
	  MySet mySet1 = new MySet(firstArray);
	  int [] secondArray = {5, 6, 7, 8, 9};
	  MySet mySet2 = new MySet(secondArray);
	  MySet multiply = mySet1.multiply(mySet2);
	  //should only return any numbers that are unique not duplicates what so ever
	  String answer = "[1, 2, 3, 4, 6, 7, 8, 9]";

	  assertEquals(answer, multiply.toString());
	 }
	@Test
	 public void divideTest(){
	  int [] firstArray = {1, 2, 3, 4, 5};
	  MySet mySet1 = new MySet(firstArray);
	  int [] secondArray = {5, 6, 7, 8, 9};
	  MySet mySet2 = new MySet(secondArray);
	  MySet divide = mySet1.divide(mySet2);
	  //should only return 5 or the duplicates only
	  String answer = "[5]";

	  assertEquals(answer, divide.toString());
	 }

}
