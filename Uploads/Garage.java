package com.qa.garageobjects;

public class Garage {

	public static void main(String[] args) {
		Car c1 = new Car("M5", "BMW", 5, 4, "Silver");
		//Lorry l1 = new Lorry("D-Max", "ISUZU", 4, 18, "White");

		java.util.ArrayList<Vehicle> vehicles = new java.util.ArrayList<>();

		vehicles.add(c1);
		//vehicles.add(l1);
		
		//for (Vehicle v : vehicles) {
			//if (v instanceof Car) {Car d = (Car) v; d.donut();}
			//v.print();
			//v.makeNoise();
		//}

		
		//Car c1 = new Car("M5", "BMW", 5, 4, "Silver");
		//Lorry l1 = new Lorry("D-Max", "ISUZU", 4, 18, "White");

		System.out.println(c1.getClass().getSimpleName());
		//System.out.println(l1.getClass().getSimpleName());

	}

}
