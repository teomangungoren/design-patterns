package edu.designpatterns.factory;

public class CarFactory {

	public Car produceCar(String carType) {
		if(carType==null) {
			return null;
		}
	  if(carType.equalsIgnoreCase("Sedan")) {
			return new Sedan();
		}
		else if(carType.equalsIgnoreCase("HatchBack")) {
			return new HatchBack();
		}
		return null;
	}
}
