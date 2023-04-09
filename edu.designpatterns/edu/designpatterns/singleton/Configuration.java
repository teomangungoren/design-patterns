package edu.designpatterns.singleton;

public class Configuration {

	private static Configuration instance;
	private String host;
	private String username;
	private String password;
	
	
	private Configuration() {
		host="localhost";
		username="root";
		password="pass";
	}


	public static Configuration getInstance() {
		if(instance==null) {
			instance=new Configuration();
		}
		return instance;
	}


	public static void setInstance(Configuration instance) {
		Configuration.instance = instance;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
