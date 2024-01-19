package Garage;

import java.util.Objects;

public class Bike extends Vehicle {

	private boolean sideCar;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(Object object, int i, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public boolean sideCar() {
		return sideCar;

	}

	public void setSidecar(boolean sideCar) {

		this.sideCar = sideCar;

	}

	@Override
	public int calcBill() {
		return 100;

	}
	// why did this automatically @override

	@Override
	public String toString() {
		return "Bike [sideCar=" + sideCar + ", name=" + name + ", wheel=" + wheel + ", fastSpeed=" + fastSpeed
				+ ", getName()=" + getName() + ", getWheel()=" + getWheel() + ", isFastSpeed()=" + isFastSpeed()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sideCar);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Bike other = (Bike) obj;
		return sideCar == other.sideCar;
	}

	// @Override
	// public void print() {
	// super.print();
	// System.out.println("Side Car " + this.sideCar);

	// commented out to allow for "to string" method

}
