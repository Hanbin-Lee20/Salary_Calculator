package lv2_lab6;
/**
 * File name: CommissionProgrammer.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: adding extra infirmation on programmer.java
 * Class list: CommissionProgrammer
 */

/**
 * This class contains Commission programmer's information
 * @author HanbinLee
 *
 */
public class CommissionProgrammer extends Programmer { 
	
	/**
	 *  gross weekly sales
	 */
	private double grossSales; 
	
	/**
	 * commission percentage
	 */
	private double commissionRate; 

	/**
	 * constructor of CommissionProgrammer class
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param month
	 * @param year
	 * @param grossSales
	 * @param commissionRate
	 */
	public CommissionProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, int month, int year, 
	double grossSales, double commissionRate) {
	super(firstName, lastName, socialSecurityNumber);

	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
	  throw new IllegalArgumentException(
	     "Commission rate must be > 0.0 and < 1.0");
	}

if (grossSales < 0.0) { // validate
	  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
	} 

/**
 * set gross sales amount on the creation of apps
 * @param grossSales
 */
public void setGrossSales(double grossSales) {
	if (grossSales < 0.0) { // validate
	  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	this.grossSales = grossSales;
	} 

/**
 * return gross sales amount 
 * @return
 */
public double getGrossSales() {
	return grossSales;
	} 

/**
 * set commission rate
 * @param commissionRate
 */
public void setCommissionRate(double commissionRate) {
	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
	  throw new IllegalArgumentException(
	     "Commission rate must be > 0.0 and < 1.0");
	}
	
	this.commissionRate = commissionRate;
	}

/**
 * return commission rate
 * @return
 */
public double getCommissionRate() {
	return commissionRate;
} 

	//calculate earnings; override abstract method earnings in Programmer.
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             

	/**
	 * String representation to display information
	 */
	@Override      
	public String toString() {
		return String.format("commision %s\n%s: $%.2f%s %s: %.2f", super.toString(), 
															"gross sales", getGrossSales(),";", "commission rates", getCommissionRate());
	}

}

