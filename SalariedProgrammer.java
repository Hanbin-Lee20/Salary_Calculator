package lv2_lab6;
/**
 * File name: SalariedProgrammer.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: adding extra information on programmer class
 * Class list: SalariedProgrammer
 */

/**
 * This class inherits from Programmer class
 * @author HanbinLee
 *
 */
public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;

	/**
	 * constructor of SalariedProgrammer
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param month
	 * @param year
	 * @param weeklySalary
	 */
	public SalariedProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, int month, int year, 
	double weeklySalary) {
	super(firstName, lastName, socialSecurityNumber); 
	
	if (weeklySalary < 0.0) {
	  throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	}
	
	this.weeklySalary = weeklySalary;
	} 

	/**
	 * set salary value
	 * @param weeklySalary
	 */
	public void setWeeklySalary(double weeklySalary) {
	if (weeklySalary < 0.0) {
	  throw new IllegalArgumentException(
	     "Weekly salary must be >= 0.0");
	}
	
	this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * return weekly salary value
	 * @return
	 */
	public double getWeeklySalary() {
	return weeklySalary;
	} 

	//calculate earnings; override abstract method earnings in Programmer
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	
	
	/**
	 * returns weekly salary value
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
	return getWeeklySalary();                                        
	}                                             

	//return String representation of SalariedProgrammer object   
	@Override        
     public String toString() {
		return String.format("Salaried %s\n%s: $%.2f", 
				super.toString(), 
				"weekly salary", getWeeklySalary());
	}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
}

