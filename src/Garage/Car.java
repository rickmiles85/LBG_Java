package Garage;

public class Car extends Vehicle implements Driveable {

	private boolean sportsCar;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Object object, int i, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public boolean sportsCar() {

		return sportsCar;

	}

	@Override
	public int calcBill() {
		return 300;
	}

	@Override
	public String toString() {
		return "Car [sportsCar=" + sportsCar + ", getId()=" + getId() + ", getName()=" + getName() + ", getWheel()="
				+ getWheel() + ", isFastSpeed()=" + isFastSpeed() + "]";
	}

	void setSports(boolean sportsCar) {

		this.sportsCar = sportsCar;

	}

	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Drive with Steering Wheel");

	}
}

// why did this automatically @override

//	@Override
//	public void print() {
//		super.print();
//		this transfer the shared details from Vehicle
//		removes the need to have individual sysout for the shared details from Vehicle
//		System.out.println("Sports Car " + this.sportsCar);
