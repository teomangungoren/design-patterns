package edu.designpatterns.singleton;

public class Test {

	public static void main(String args[]) {
		
		Configuration configuration=Configuration.getInstance();
		System.out.println("Host: "+configuration.getHost());
		System.out.println("Username: "+configuration.getUsername());
		System.out.println("Password: "+configuration.getPassword());
		
		
		configuration.setHost("localhost2");
		configuration.setUsername("root2");
		configuration.setPassword("pass2");
		
		System.out.println("********************************");
		Configuration configuration2=Configuration.getInstance();
		System.out.println("Host: "+configuration2.getHost());
		System.out.println("Username: "+configuration2.getUsername());
		System.out.println("Password: "+configuration2.getPassword());
	}
}
