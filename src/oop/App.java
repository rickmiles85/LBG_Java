package oop;

public class App {

	public static void main(String[] args) {

		Person details = new Person("Richard", "Trainee Software Engineer", 38, "Warrington");

		// details.setName("Jordan");
		// details.setOccupation("Software Trainer");
		// details.setAge(29);
		// details.setLocation("Cannock");

		Person[] persons = { details };

		for (Person person : persons) {

			person.print();
			person.getAge();

		}
	}
}