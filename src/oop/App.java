package oop;

public class App {

	public static void main(String[] args) {
		
	
		Person details = new Person();
		
		details.name = "Jordan";
				details.occupation = "Software Trainer";
				details.age = 29;
				details.location = "Cannock";
				
		Person details1 = new Person();
				
				details1.name = "Richard";
				details1.occupation = "Trainee Software Engineer";
				details1.age = 38;
				details1.location = "Warrington";
				
Person details2 = new Person();
				
				details2.name = "John";
				details2.occupation = "Trainee Software Engineer";
				details2.age = 50;
				details2.location = "Manchester";
				
				Person[] persons = { details, details1, details2 };
				
				for (Person person : persons) {
					
					person.print();
					
					
					
				}
				
	}
}