package edu.designpatterns.strategy;

public class Test {

	public static void main(String args[]) {
		
		ShoppingCart shoppingCart=new ShoppingCart();
		Item item1=new Item("laptop", 1200);
		Item item2=new Item("fridge", 1500);
		
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		
		PaymentStrategy creditMethod=new CreditCardPayment("teomangungoren","1235","466","09/24");
		shoppingCart.pay(creditMethod);
	}
}
