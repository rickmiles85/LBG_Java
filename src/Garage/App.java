package Garage;

import java.util.List;

public class App {

	private static final String vehicle = null;
	public static void main(String[] args) {

		Car porsche = new Car(null, 0, false);
		porsche.setName("Porsche");
		porsche.setWheel(4);
		porsche.setFastSpeed(true);
		porsche.setSports(true);

		// porsche.print();

		Bike honda = new Bike(null, 0, false);
		honda.setName("Honda");
		honda.setWheel(2);
		honda.setFastSpeed(true);
		honda.setSidecar(true);

		// honda.print();

		// This brings in data from Vehicle file - without having to set anything. Wraps
		// it all within brackets

//		Vehicle tesla = new Vehicle("Tesla", 4, true);
//		tesla.print();
//
//		Bike kawasaki = new Bike();
//		kawasaki.print();

//		Pulls through details from Vehicle. Able to create new 

//		Vehicle v = new Vehicle("Bugatti", 4, true);
//		Vehicle v2 = new Vehicle("Skoda", 4, false);
//		Vehicle v3 = new Vehicle("Aston Martin", 4, false);
//
//		Vehicle[] vehicles = { v, v2, v3 };
//
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();

		// ArrayList<Vehicle> vehicles = new ArrayList<>();
		// vehicles.add(new Vehicle("Tesla", 4, true, true));

		// System.out.println(vehicles);

		// for (Vehicle vehicle : vehicles) {
		// vehicle.print();

		// }

		Garage myGarage = new Garage("Rick Car and Bike Garage");

		myGarage.driveIn(new Car("Bugatti", 4, true));
		myGarage.driveIn(new Car("Skoda", 4, true));
		myGarage.driveIn(new Car("Aston Martin", 4, true));
		myGarage.print();

		Car car1 = new Car("Bugatti", 4, true);
		Car car2 = new Car("Skoda", 4, false);
		Bike bike1 = new Bike("KTM", 2, false);
		Bike bike2 = new Bike("BMW", 4, true);

		System.out.println("Does Car 1 = Car 1: " + car1.equals(car1));
		System.out.println("Does Car 1 = Car 2: " + car1.equals(car2));
		System.out.println("Does Bike 2 = Bike 2: " + bike2.equals(bike2));
		System.out.println("Does Bike 1 = Bike 2:" + bike1.equals(bike2));

		System.out.println(porsche);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(bike1);
		System.out.println(bike2);

		List<Vehicle> vehicles = List.of(new Car(), new Bike());

	public boolean driveIn(Vehicle v) {
		return this.vehicle.add(v);
		{

			myGarage.fix();

		}

	}
}
