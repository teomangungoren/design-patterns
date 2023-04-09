package edu.designpatterns.decorator;

public class ChocolateChipsDecorator extends IceCreamDecorator{

	public ChocolateChipsDecorator(IceCream iceCream) {
        super(iceCream);
    }
    public String getDescription() {
        return super.getDescription() + ", Chocolate Chips";
    }
    public double getCost() {
        return super.getCost() + 0.25;
    }
    
    public static void main(String args[]) {
    	IceCream iceCream = new VanillaIceCream();
        iceCream = new ChocolateChipsDecorator(iceCream);
        System.out.println(iceCream.getDescription() + " $" + iceCream.getCost());
    }
}
