package com.lq.calculators;




/**
 * Here is our main class that we're writing a doc for
 * 
 * {@link com.lq.calculators.ScientificCalculator}
 * @author Caption America
 * @version 2.5
 * @since 2.0
 * @deprecated this class will be removed soon
 *
 */
public class BasicCalculator {
	
	/**
	 * Full name of a person
	 */
	private String name;
	

	
	
	/**
	 * 
	 * @param a The first number
	 * @param b The second number
	 * @return Sum of of two provided numbers
	 * @see <a href="https://google.com"> Ticket #24 </a>
	 * @since 2.0
	 * @deprecated this will be removed next week, use Calculator2 <a href="https://google.com"> Ticket #54 </a>
	 * @throws Some comment about throws
	 */
	public double add(double a, double b) {
		return a+b;
	}
	
	
	
	
	public double subtract(double a, double b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		return a/b;
	}
	
}
