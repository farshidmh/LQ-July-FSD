package com.lq.calculators;

public class ScientificCalculator {

	public static final double PI = 3.14159;

	private double holdValue;

	public double exp(double x) {
		return Math.exp(x);
	}

	public double log(double x) {
		return Math.log(x);

	}

	public void putValueInMemory(double x) {
		holdValue = x;
	}
	
	public double getValueFromMemory() {
		return holdValue;
	}
	
	
	
}
