package lv2_lab6;

//This is the test for interface Payme.

public class PaymeInterfaceTest  {

	public static void main(String[] args) {
	
	Payme[] paymeObjects = new Payme[6];
	
	// THE ARRAY WITH OBJECTS THAT IMPLEMENT Payable
	paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
	paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
	paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 9, 2023, 320.00);
	paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 9, 2023, 18.95, 40.00);
	paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 9, 2023, 16500.00, 0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("Hanbin", "Lee", "321-45-8673", 9, 2023, 1200.00, 0.04, 720.00);
    
	 System.out.println("\nPayment for Invoices and Programmers are processed polymorphically:\n"); 
	
	 // generically process each element in array paymeObjects
	 for (Payme currentPayme : paymeObjects) {
		 
	    // output currentPayme and its appropriate payment amount    
	    if (currentPayme instanceof BasePlusCommissionProgrammer) {
	       // downcast Payme reference to 
	       // BasePlusCommissioProgrammer reference
	       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
	       // ((BasePlusCommissionProgrammer) currentPayme).getBaseSalary();
	       double oldBaseSalary = programmer.getBaseSalary();
	       programmer.setBaseSalary(1.10 * oldBaseSalary);
	       System.out.printf("%s \n", currentPayme.toString()); 
	       
	       System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
	       System.out.printf("%s: $%.2f \n\n", "payment due", currentPayme.getPaymentAmount());

	    }else {
	    	System.out.printf("%s \n", currentPayme.toString());
	    	System.out.printf("%s: $%.2f \n\n", "payment due", currentPayme.getPaymentAmount());
	    }
	    
	
	
	
	
	 		}
		}
}


