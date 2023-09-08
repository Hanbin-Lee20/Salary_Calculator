package lv2_lab6;

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
