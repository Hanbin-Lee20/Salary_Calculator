package lv2_lab6;
/**
 * File name: Programmer.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: super class of every ...Programmer subclasses.
 * Class list: Programmer
 */

/**
 * Parent class of Salaried, Hourly, Commission and BasePlusCommissionProgrammer classes.
 * This class can have abstract methods without providing their implementation in the class itself.
 * @author HanbinLee
 *
 */
public abstract class Programmer implements Payme{
	
	/**
	 * Programmer's first name
	 */
	private String firstName;
	
	/**
	 * Programmer's last name
	 */
	private String lastName;
	
	/**
	 * Programmer's socialSecurityNumber
	 */
	private String socialSecurityNumber;

	/**
	 * three-argument constructor
	 * @param first
	 * @param last
	 * @param ssn
	 */
	public Programmer(String first, String last, String ssn) {
		 firstName = first;
		 lastName = last;
		 socialSecurityNumber = ssn;
	}

	/** CHANGES ARE REQUIRED IN THIS SECTION. 
	* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
	* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	*/
	
	/*
	 * Sets the first name value
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/*
	 * Gets the first name value
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Sets the last name value
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*
	 * Gets the last name value
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * Sets the setSocial Security Number value
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	/*
	 * Gets the setSocialSecurityNumber value
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("programmer: %s %s\n%s: %s", getFirstName(), getLastName(),
							"social security number", getSocialSecurityNumber());
		} 

	//Note: We do NOT implement Payme method getPaymentAmount() here. 
	// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
	
	
//	public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
	} 


