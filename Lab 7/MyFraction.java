/*
 * Kayleen Ponce
 * Lab7 MyFraction
 * */
package Lab7;

import java.util.ArrayList;

public class MyFraction implements MyMath<MyFraction> {
	private char sign;
	private int numerator;
	private int denominator;
	private ArrayList<Integer> array1 = new ArrayList<Integer>();
	private ArrayList<Integer> array2 = new ArrayList<Integer>();

	public MyFraction(char sign, int numerator, int denominator) {
		this.sign = sign;
		this.numerator = numerator;
		this.denominator = denominator;
	}

	// Adding Method
	@Override
	public MyFraction add(MyFraction o) {
		if (o.denominator == denominator) {
			if (sign == '-' && o.sign == '-') {
				int newNum = o.numerator + numerator;
				MyFraction additionSameSign = new MyFraction(sign, newNum, denominator);
				return simplifyFraction(additionSameSign);
				}  
			if (sign == '+' && o.sign == '+') {
				int newNum = o.numerator + numerator;
				MyFraction additionSameSign = new MyFraction(sign, newNum, denominator);
				return simplifyFraction(additionSameSign);
				}	
			else {
			if (o.numerator > numerator) {
				int newNum = o.numerator - numerator;
				MyFraction additionDiffSign1 = new MyFraction(o.sign, newNum, denominator);
				return simplifyFraction(additionDiffSign1);
				}
			if (o.numerator < numerator) {
				int newNum = numerator - o.numerator;
				MyFraction additionDiffSign2 = new MyFraction(sign, newNum, denominator);
				return simplifyFraction(additionDiffSign2);
				}
			if (o.numerator == numerator) {
				MyFraction zeroCondtion = new MyFraction('+', 0, 0);
				return zeroCondtion;
				}
			}
		}
		else {
			int numFirstFraction = o.numerator * denominator;
			int denFirstFracion = o.denominator * denominator;

			int numSecFraction = numerator * o.denominator;
			int denSecFraction = denominator * o.denominator;

			if (sign == '-' && o.sign == '-') {
				int sumNumerator = numFirstFraction + numSecFraction;
				MyFraction sameSign = new MyFraction(sign, sumNumerator, denSecFraction);
				return simplifyFraction(sameSign);
			}
			if (sign == '+' && o.sign == '+') {
				int sumNumerator = numFirstFraction + numSecFraction;
				MyFraction sameSign = new MyFraction(sign, sumNumerator, denSecFraction);
				return simplifyFraction(sameSign);
			}
			if (o.numerator > numerator) {
				int sumNumerator = numFirstFraction - numSecFraction;
				MyFraction sameSign = new MyFraction(o.sign, sumNumerator, denSecFraction);
				return simplifyFraction(sameSign);
			}
			if (o.numerator < numerator) {
				int sumNumerator = numSecFraction - numFirstFraction;
				MyFraction sameSign = new MyFraction(sign, sumNumerator, denSecFraction);
				return simplifyFraction(sameSign);
			}
		}
		return o;
	}
	
	// Subtraction Method
	@Override
	public MyFraction subtract(MyFraction o) {
		if (denominator == o.denominator) {
			if (sign == '-' && o.sign == '-') {
				if (o.numerator > numerator) {
					int newNum = o.numerator - numerator;
					MyFraction subtraction1 = new MyFraction(o.sign, newNum, denominator);
					return simplifyFraction(subtraction1);
				}
				if (o.numerator < numerator) {
					int newNum = numerator - o.numerator;
					MyFraction subtraction2 = new MyFraction(sign, newNum, denominator);
					return simplifyFraction(subtraction2);
				}
				if (o.numerator == numerator) {
					MyFraction subtractionZero = new MyFraction('+', 0, 0);
					return subtractionZero;
				} 
			}
			if (sign == '-' && o.sign == '+') {
					int newNum = o.numerator + numerator;
					MyFraction subtraction3 = new MyFraction(sign, newNum, denominator);
					return simplifyFraction(subtraction3);
				}
			if (sign == '+' && o.sign == '-') {
					int newNum = o.numerator + numerator;
					MyFraction subtraction4 = new MyFraction(sign, newNum, denominator);
					return simplifyFraction(subtraction4);
				} 
			if (sign == '+' && o.sign == '+') {
					if (o.numerator > numerator) {
						int newNum = o.numerator - numerator;
						MyFraction subtraction5 = new MyFraction(o.sign, newNum, denominator);
						return simplifyFraction(subtraction5);
					}
					if (o.numerator < numerator) {
						int newNum = numerator - o.numerator;
						MyFraction subtraction6 = new MyFraction(sign, newNum, denominator);
						return simplifyFraction(subtraction6);
					}
					if (o.numerator == numerator) {
						MyFraction subtractionZero = new MyFraction('+', 0, 0);
						return subtractionZero;
					}
				}
			} 
			else {
				int numFirstFraction = o.numerator * denominator;
				int denFirstFracion = o.denominator * denominator;

				int numSecFraction = numerator * o.denominator;
				int denSecFraction = denominator * o.denominator;
				if (sign == '-' && o.sign == '-') {
					if (o.numerator > numerator) {
						int newNum = numFirstFraction - numSecFraction;
						MyFraction subtraction1 = new MyFraction(o.sign, newNum, denSecFraction);
						return simplifyFraction(subtraction1);
					}
					if (o.numerator < numerator) {
						int newNum = numFirstFraction - numSecFraction;
						MyFraction subtraction2 = new MyFraction(sign, newNum, denSecFraction);
						return simplifyFraction(subtraction2);
					}
					if (o.numerator == numerator) {
						MyFraction subtractionZero = new MyFraction('+', 0, 0);
						return subtractionZero;
					}
				}
				if (sign == '-' && o.sign == '+') {
						int newNum = numFirstFraction + numSecFraction;
						MyFraction subtraction3 = new MyFraction(sign, newNum, denSecFraction);
						return simplifyFraction(subtraction3);
					}
				if (sign == '+' && o.sign == '-') {
					int newNum = numFirstFraction + numSecFraction;
					MyFraction subtraction4 = new MyFraction(sign, newNum, denSecFraction);
					return simplifyFraction(subtraction4);
				}
				if (sign == '+' && o.sign == '+') {
					if (o.numerator > numerator) {
						int newNum = numSecFraction - numFirstFraction;
						MyFraction subtraction5 = new MyFraction('-', newNum, denSecFraction);
						return simplifyFraction(subtraction5);
					}
					if (o.numerator < numerator) {
						int newNum = numFirstFraction - numSecFraction;
						MyFraction subtraction6 = new MyFraction(sign, newNum, denSecFraction);
						return simplifyFraction(subtraction6);
					}
				}
			}
		return o;
	}
	
	// Divide Method
	@Override
	public MyFraction divide(MyFraction o) {
		int divideNum = o.numerator * denominator;
		int divideDen = o.denominator * numerator;
		
		MyFraction divideNewObject = new MyFraction(o.sign, divideNum, divideDen);
		return simplifyFraction(multiplyAndDivide(divideNewObject));
	}

	@Override
	public MyFraction multiply(MyFraction o) {
		int multiplyNum = o.numerator * numerator;
		int multiplyDen = o.denominator * denominator;

		MyFraction divideNewObject = new MyFraction(o.sign, multiplyNum, multiplyDen);
			return simplifyFraction(multiplyAndDivide(divideNewObject));
		}
	
	public MyFraction simplifyFraction(MyFraction o) {
		if ((o.numerator % 2) == 0 && (o.denominator % 2) == 0) {
			for (int i = 1; i <= o.numerator; i++) {
				if ((o.numerator % i) == 0) {
					array1.add(i);
				}
			}
			for (int i = 1; i <= o.denominator; i++) {
				if ((o.denominator % i) == 0) {
					array2.add(i);
				}
			}

			int store = 0;
			for (int i = array1.size() - 1; i > 0; i--) {
				store = array1.get(i);
				for (int j = array2.size() - 1; j > 0; j--) {
					if (array1.get(i) == array2.get(j)) {
						store = array1.get(i);
						j = 0;
						i = 0;
					}
				}
			}
			int reducedNum = o.numerator / store;
			int reducedDenom = o.denominator / store;

			MyFraction newObject1 = new MyFraction(o.sign, reducedNum, reducedDenom);
			return newObject1;
		}
		return o;
	}
	
	public MyFraction multiplyAndDivide(MyFraction o) {
		if(sign == '-' && o.sign == '-'){
			MyFraction divideNewObject = new MyFraction('+', o.numerator, o.denominator);
			return simplifyFraction(divideNewObject);
		}
		if(sign == '+' && o.sign == '+'){
			MyFraction divideNewObject = new MyFraction('+', o.numerator, o.denominator);
			return simplifyFraction(divideNewObject);
		}
		if(sign == '-' && o.sign == '+'){
			MyFraction divideNewObject = new MyFraction('-', o.numerator, o.denominator);
			return simplifyFraction(divideNewObject);
		}
		if(sign == '+' && o.sign == '-'){
			MyFraction divideNewObject = new MyFraction('-', o.numerator, o.denominator);
			return simplifyFraction(divideNewObject);
		}
		return o;
	}

	// Get and Setters
	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		if(sign == '+'){
			return numerator + "/" + denominator;
		}
		else{
		return sign + "" + numerator + "/" + denominator;
		}
	}

}
