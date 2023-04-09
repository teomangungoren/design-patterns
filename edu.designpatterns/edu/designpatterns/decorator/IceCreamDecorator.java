package edu.designpatterns.decorator;

public abstract class IceCreamDecorator implements IceCream {

	 protected IceCream iceCream;
	   
	 public IceCreamDecorator(IceCream iceCream) {
	        this.iceCream = iceCream;
	    }
	    public String getDescription() {
	        return iceCream.getDescription();
	    }
	    public double getCost() {
	        return iceCream.getCost();
	    }
}
