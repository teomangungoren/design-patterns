package edu.designpatterns.observer;

public class ConcreteObserver extends Observer{

	private int observerState;

	public ConcreteObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		observerState=subject.getState();
		System.out.println("Observer state updated: "+observerState);
		}
	
	
}
