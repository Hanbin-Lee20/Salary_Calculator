package lv2_lab6;
/**
 * File name: Payme.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: interface for Programmer and Invoice class
 */	
public interface Payme {
	
	/**
	 * interface of getPaymentAmount method
	 * @return
	 */
	double getPaymentAmount();
	
	/**
	 * interface of toString method.
	 * @return
	 */
	String toString();
	
	/**
	 * display method for part B
	 */
	default void display() {
		System.out.println(this.toString()+"\n");
	}

	}
