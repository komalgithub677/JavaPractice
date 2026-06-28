package IfElsePractice;

public class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Start method of the vechile class");	
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
	}

}
