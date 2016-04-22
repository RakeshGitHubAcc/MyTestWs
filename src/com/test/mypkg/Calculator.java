package com.test.mypkg;

public class Calculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int substarction(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) {
		int c = 0;
		if (num2 != 0) {
			c = num1 / num2;
		}
		return c;
	}
}
