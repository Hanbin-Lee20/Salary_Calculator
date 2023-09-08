package lv2_lab6;

public class PaymeInterfaceTest2  {

	public static void main(String[] args) {
		
	//SIX-ELEMENTS Payme array
	
	Payme[] paymeObjects = new Payme[6];
	
	//objects of invoice class
	paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
	paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
	paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 9, 2023, 320.00);
	paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 9, 2023, 18.95, 40.00);
	paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 9, 2023, 16500.00, 0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("John", "Doe", "321-45-8673", 9, 2023, 1200.00, 0.04, 720.00);
    
	 System.out.println("\nPayment for Invoices and Programmers are processed polymorphically:\n"); 
	
	 // generically process each element in array paymeObjects
	 
	 for (Payme currentPayme : paymeObjects) {
	    // output currentPayme and its appropriate payment amount    
	    currentPayme.display();
//	    if (currentPayme instanceof BasePlusCommissionProgrammer) {
//	       // downcast Payme reference to 
//	       // BasePlusCommissioProgrammer reference, and know why we're doing thisS
//	       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
//	
//	       double oldBaseSalary = programmer.getBaseSalary();
//	       programmer.setBaseSalary(1.10 * oldBaseSalary);
//	       System.out.printf("%s \n", currentPayme.toString()); 
//	       
//	       System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
//	       System.out.printf("%s: $%.2f \n\n", "payment due", currentPayme.getPaymentAmount());
//
//	    }else {
//	    	System.out.printf("%s \n", currentPayme.toString());
//	    	System.out.printf("%s: $%.2f \n\n", "payment due", currentPayme.getPaymentAmount());
//	    }
	    

	
	
	
	 		}
	 
	
		}
}


