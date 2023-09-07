package lv2_lab6;
/**
 * File name: Invoice.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab 6
 * Professor: Hesham Saadawi
 * Purpose: containing invoice information
 * Class list: Invoice
 */
//LAB 6 - CST8284
//LAB 6: Invoice.java

//This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass

//The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!

/**
 * Class that stores invoice item information
 * @author HanbinLee
 *
 */
public class Invoice implements Payme {
	
	/**
	 * part number variable
	 */
	private String partNumber;
	
	/**
	 * part description variable
	 */
	private String partDescription;
	
	/**
	 * quantity variable
	 */
	private int quantity;
	
	/**
	 * price per item variable
	 */
	private double pricePerItem;

//four-argument constructor
	public Invoice(String part, String description, int count, double price) {
		 partNumber = part;
		 partDescription = description;
		 setQuantity(count); // validate and store quantity
		 setPricePerItem(price); // validate and store price per item
	}

	//set part number
	public void setPartNumber(String part) {
		partNumber = part; 
	}
	
	//get part number
	public String getPartNumber() {
		return partNumber;
	}
	
	//set description
	public void setPartDescription(String description) {
		partDescription = description; 
	}
	
	//get description
	public String getPartDescription() {
		return partDescription;
	}
	
	//set quantity
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
	
	//get quantity
	public int getQuantity() {
		return quantity;
	}
	
	//set price per item
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}
	
	//get price per item
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	//return String representation of Invoice object
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
	    "invoice", "part number", getPartNumber(), getPartDescription(), 
	    "quantity", getQuantity(), "price per item", getPricePerItem());
	} 
	
	//method required to carry out contract with interface Payme
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


