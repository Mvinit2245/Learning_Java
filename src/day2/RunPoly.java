package day2;

public class RunPoly {
	
	public static void main(String args[]) {
		
		Payment payment1 = new CreditCard();
		Payment payment2 = new PayPal();
		Payment payment3 = new Payment();
		
		payment1.processPayment();
		payment2.processPayment();
		payment3.processPayment();
		
		
		
		
	}

	
		
		
}

class Payment {
	void processPayment() {
	System.out.println("Processing payment");
	}
	}
	class CreditCard extends Payment {
	@Override
	void processPayment() {
	System.out.println("Processing credit card payment");
	}
	}
	class PayPal extends Payment {
	@Override
	void processPayment() {
	System.out.println("Processing PayPal payment");
	}
	}


