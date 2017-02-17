/*
 * Aaron Alvarez
 * Lab7 MyFraction Test
 * */
package Lab7Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Lab7.MyFraction;

public class MyFractionTest {

	// Test Instances

	// Test Constructor

	@Test
	public void createObjectTester() {
		MyFraction f1 = new MyFraction('+', 3, 4);
		MyFraction f2 = new MyFraction('+', 3, 4);
		assertNotNull(f1);
		assertNotNull(f2);
	}

	@Test
	public void addFractionSameDenomSameSign() {
		MyFraction f1 = new MyFraction('-', 3, 4);
		MyFraction f2 = new MyFraction('-', 3, 4);
		String answer1 = "-3/2";
		MyFraction test1 = f1.add(f2);
		assertEquals(answer1, test1.toString());
	}

	@Test
	public void addFractionSameDenomDiffSign() {
		MyFraction f3 = new MyFraction('-', 6, 4);
		MyFraction f4 = new MyFraction('+', 3, 4);
		String answer2 = "-3/4";
		MyFraction test2 = f3.add(f4);
		assertEquals(answer2, test2.toString());
	}

	@Test
	public void addFractionSameDenomAnswerZero() {
		MyFraction f5 = new MyFraction('-', 3, 4);
		MyFraction f6 = new MyFraction('+', 3, 4);
		String answer3 = "0/0";
		MyFraction test3 = f5.add(f6);
		assertEquals(answer3, test3.toString());
	}

	@Test
	public void addFractionDiffDenomSameSign() {
		MyFraction f7 = new MyFraction('-', 3, 4);
		MyFraction f8 = new MyFraction('-', 2, 3);
		String answer4 = "-17/12";
		MyFraction test4 = f7.add(f8);
		assertEquals(answer4, test4.toString());
	}

	@Test
	public void addFractionDiffDenomOppSign() {
		MyFraction f9 = new MyFraction('+', 2, 3);
		MyFraction f10 = new MyFraction('-', 3, 4);
		String answer5 = "-1/12";
		MyFraction test5 = f9.add(f10);
		assertEquals(answer5, test5.toString());
	}

	// Subtraction
	@Test
	public void subSameSignSameDenom() {
		MyFraction f11 = new MyFraction('+', 3, 4);
		MyFraction f12 = new MyFraction('-', 3, 4);
		String answer6 = "3/2";
		MyFraction test6 = f11.subtract(f12);
		assertEquals(answer6, test6.toString());
	}

	@Test
	public void subDiffSignSameDenom() {
		MyFraction f13 = new MyFraction('+', 3, 4);
		MyFraction f14 = new MyFraction('+', 3, 4);
		String answer7 = "0/0";
		MyFraction test7 = f13.subtract(f14);
	
		assertEquals(answer7, test7.toString());
	}

	// make a method that tests the math

	@Test
	public void subSameSignDiffDenom() {
		MyFraction f15 = new MyFraction('+', 2, 3);
		MyFraction f16 = new MyFraction('+', 3, 3);
		String answer8 = "1/3";
		MyFraction test8 = f15.subtract(f16);
		assertEquals(answer8, test8.toString());
	}

	// Make method to check math on Divide

	@Test
	public void divide() {
		MyFraction f17 = new MyFraction('+', 3, 3);
		MyFraction f18 = new MyFraction('+', 3, 2);
		String answer9 = "9/6";
		MyFraction test9 = f17.divide(f18);
		assertEquals(answer9, test9.toString());
	}

	// Make method for Multiply Math

	@Test
	public void multiply() {
		MyFraction f19 = new MyFraction('+', 3, 3);
		MyFraction f20 = new MyFraction('+', 3, 2);
		String answer10 = "3/2";
		MyFraction test10 = f19.subtract(f20);
		assertEquals(answer10, test10.toString());
	}

	// MAYBE make a method just to simplify

}
