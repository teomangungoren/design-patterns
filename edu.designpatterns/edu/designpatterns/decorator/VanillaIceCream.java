package edu.designpatterns.decorator;

public class VanillaIceCream implements IceCream {

	@Override
	public String getDescription() {
		return "Vanilla Ice Cream";
	}

	@Override
	public double getCost() {
		return 2.00;
	}

}
