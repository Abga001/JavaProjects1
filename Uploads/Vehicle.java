package com.qa.garageobjects;

public class Vehicle extends Object {
	
	// private variables for vehicle object
	private String name;
	private String manufacturer;
	private int seats;
	private int wheels;
	private String colour;

	//public Vehicle() {
		//super();
	//}

	//public Vehicle(String name, String colour) {
		//super();
		//this.name = name;
		//this.colour = colour;
	//}
	
	
	//vehicle constructor
	public Vehicle(String name, String manufacturer, int seats, int wheels, String colour) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.seats = seats;
		this.wheels = wheels;
		this.colour = colour;
	}

	public void print() {
		System.out.println("This vehicle is a " + name);
		System.out.println("The colour is " + this.colour);
		System.out.println("And it has " + seats + " seats.");
	}

	public void makeNoise() {
		System.out.println("VROOOOOOOMMMMM");
	}

	public void setSeats(int seats) {
		if (seats > 1 && seats < 12)
			this.seats = seats;
		else
			System.out.println("Invalid number of seats: " + seats);
	}
	
	//public void setWheels(int wheels) {
		//if (wheels > 2 && wheels < 12)
			//this.wheels = wheels;
		//else
			//System.out.println("Invalid number of wheels: " + wheels);
	//}

	public int getSeats() {
		return this.seats;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public String getWheels() {
		//return this.wheels;
	//}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}