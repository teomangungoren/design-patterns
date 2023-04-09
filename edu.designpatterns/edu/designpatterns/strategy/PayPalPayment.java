package edu.designpatterns.strategy;

public class PayPalPayment implements PaymentStrategy{

	private String email;
	private String password;
	
	public PayPalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount+" paid by PayPal.");
		
	}
	
	
}
