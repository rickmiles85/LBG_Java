package oop;

public class Person {

	private String name;

	private String occupation;

	private int age;

	private String location;

	public Person(String name, String occupation, int age, String location) {
		// using the setters keeps the validation we wrote earlier
		setName(name);
		setLocation(location);
		setAge(age);
		setOccupation(occupation);
		// auto-generate will look like this:

	}

	public void print() {

		System.out.println(name);
		System.out.println(occupation);
		System.out.println(age);
		System.out.println(location);
	}

	public void setAge(int age) {
		if (age >= 0 && age < 115) {
			this.age = age;
		} else {
			System.out.println("This person cannot be older than 115");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;

	}

	public void setLocation(String location) {
		this.location = location;

	}

	public int getAge() {
		return age;

	}

	public String getOccupation() {
		return occupation;

	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
}
