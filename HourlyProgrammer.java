package lv2_lab6;
/**
 * File name: HourlyProgrammer.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: adding extra information on programmer.jva
 * Class list: HourlyProgrammer
 */

/**
 * This class provides hourly paid programmer's information
 * @author HanbinLee
 *
 */
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

/*
 * constructor of HourlyProgrammer class
 */
public HourlyProgrammer(String firstName, String lastName,
	String socialSecurityNumber, int month, int year, 
	double wage, double hours) {
	super(firstName, lastName, socialSecurityNumber);

	if (wage < 0.0) { // validate wage
	  throw new IllegalArgumentException(
	     "Hourly wage must be >= 0.0");
	}
	
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}

	this.wage = wage;
	this.hours = hours;
	} 

	/**
	 * set wage
	 * @param wage
	 */
	public void setWage(double wage) {
	if (wage < 0.0) { // validate wage
	  throw new IllegalArgumentException(
	     "Hourly wage must be >= 0.0");
	}
	
	this.wage = wage;
	} 

	/**
	 * return wage
	 * @return
	 */
	public double getWage() {
	return wage;
	} 

	/**
	 * set hours worked
	 * @param hours
	 */
	public void setHours(double hours) {
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}
	
	this.hours = hours;
	} 
	
	/**
	 * return hours worked
	 * @return
	 */
	public double getHours() {
	return hours;
	} 

	//calculate earnings; override abstract method earnings in Programmer
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	
	@Override                                                           
	public double getPaymentAmount() {                                            
	if (getHours() <= 40) { // no overtime                           
	  return getWage() * getHours();   
	}
	else {                                                             
	  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
}                                          

	//return String representation of HourlyProgrammer object              
	@Override                                                             
	public String toString() {
		return String.format("Hourly %s\n%s: $%.2f%s %s: %.2f", 
				super.toString(), 
				"hourly wage", getWage(), ";", "hours worked", getHours());
	}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

                     
}

