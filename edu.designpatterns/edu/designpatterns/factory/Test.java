package edu.designpatterns.factory;

public class Test {

	public static void main(String[] args) {
	
	CarFactory carFactory=new CarFactory();
	
	//sedan
	
	Car sedan=carFactory.produceCar("Sedan");
    sedan.produce();
	
	Car hatchBack=carFactory.produceCar("HatchBack");
	hatchBack.produce();
	
	
	
	}
}
