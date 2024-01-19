package Garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Garage {

	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private Car[] car;

	public Garage(String name) {
		super();
		this.name = name;

	}

	@Override
	public int hashCode() {
		return Objects.hash(name, vehicles);
	}

	@Override
	public String toString() {
		return "Garage [name=" + name + ", vehicles=" + vehicles + ", car=" + Arrays.toString(car) + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Garage other = (Garage) obj;
		return Objects.equals(name, other.name) && Objects.equals(vehicles, other.vehicles);
	}

	public void driveIn(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public String getName() {
		return name;

	}

	public String setName(String name) {
		return this.name = name;

	}

	public void driveOut(Vehicle vehicle) {
		vehicles.remove(vehicle);

		{
			// vehicle.print();
		}

	}

	public void print() {

		for (Vehicle vehicle : vehicles) {
			// ' vehicle.print();
		}

	}

	public void fix() {
		int fixBill = 0;
		for (Vehicle vehicle : vehicles) {
			fixBill += vehicle.calcBill();
			System.out.println("Total Bill Cost: " + fixBill);
		}

	}
	// DO NOT NEED TO MAKE A METHOD FOR EACH KIND OF VEHICLE}

}
