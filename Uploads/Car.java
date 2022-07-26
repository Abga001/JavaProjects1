package com.qa.garageobjects;

public class Car extends Vehicle {

	private boolean babyseat;
	
	public Car() {
			super();
	}

	public Car(boolean babyseat) {
		super();
		this.babyseat = babyseat;
	}
	
	public Car(String name, String manufacturer, int seats, int wheels, String colour, boolean babyseat) {
		super(name, manufacturer, seats, wheels, colour);
		this.babyseat = babyseat;
	}
	
	public Car(String name, String manufacturer, int seats, int wheels, String colour){
		super(name, manufacturer, seats, wheels, colour);
	}
	
	public Car(String name, String manufacturer) {
		super(name, manufacturer);
	}
	
	
	public boolean isBabyseat() {
			return this.babyseat;
	}
	
	public void setBabyseat(boolean kennel) {
		this.babyseat = babyseat;
	}
}