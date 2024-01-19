package Garage;

import java.util.Objects;

public abstract class Vehicle {
// needed to change string from private to protected?

	protected String name;
	protected int wheel;
	protected boolean fastSpeed;
	protected int id;
	protected static int count = 0;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	// count = 1 make sure it starts at 1.

	// the parameters need to be different from the one below otherwise it will
	// break

	public Vehicle() {
		super();
		this.id = ++count;
	}

	public Vehicle(String name, int wheel, boolean fastSpeed) {
		super();
		this.id = ++count;
		this.setName(name);
		this.setWheel(wheel);
		this.setFastSpeed(fastSpeed);

	}

	public int calcBill() {
		return 500;

	}

	@Override
	public int hashCode() {
		return Objects.hash(fastSpeed, name, wheel);
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", wheel=" + wheel + ", fastSpeed=" + fastSpeed + ", id=" + id + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getWheel()=" + getWheel() + "]";
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
		Vehicle other = (Vehicle) obj;
		return fastSpeed == other.fastSpeed && Objects.equals(name, other.name) && wheel == other.wheel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public boolean isFastSpeed() {
		return fastSpeed;
	}

	public void setFastSpeed(boolean fastSpeed) {
		this.fastSpeed = fastSpeed;
	}

	// public void print() {

	// System.out.println("Name " + this.name);
	// System.out.println("Wheels " + this.wheel);
	// System.out.println("Fast Speed " + this.fastSpeed);

	// commented out to allow for "to string" method
}