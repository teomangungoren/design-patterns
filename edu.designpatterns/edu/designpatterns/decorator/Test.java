package edu.designpatterns.decorator;

public class Test {

	public static void main(String ... args) {
		
		IceCream iceCream = new VanillaIceCream();
	    iceCream = new ChocolateChipsDecorator(iceCream);
	    System.out.println(iceCream.getDescription() + " $" + iceCream.getCost());
	}
}
