package edu.designpatterns.observer;

public class Test {

	public static void main(String[] args) {
		Subject subject=new Subject();
		
		ConcreteObserver observer1=new ConcreteObserver(subject);
		ConcreteObserver observer2=new ConcreteObserver(subject);
		
		subject.setState(1);
		subject.setState(2);
		
		subject.detach(observer1);
		
		subject.setState(3);
	}
}
