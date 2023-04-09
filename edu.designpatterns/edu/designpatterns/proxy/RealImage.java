package edu.designpatterns.proxy;

public class RealImage implements Image{

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
	
	private void loadFromDisk() {
		System.out.println("Loading "+fileName);
	}
	
	
}
