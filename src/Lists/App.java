package Lists;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();

		words.add("Hello");
		words.add("World");
		words.add("!");
		System.out.println(words);

		words.remove("!");
		words.remove(1);
		System.out.println(words);

		for (int i = 0; i < 5; i++) {

			words.add("barry");
		}
		// never modify a list when you're looping over it
		System.out.println(words);
		while (words.contains("barry"))
			;

		words.remove("barry");

		System.out.println(words);

		// numbers can not be removed from Ints. Numbers are a number and will only
		// remove the Index

		ArrayList<Interger> nums = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			nums.add(i * 2);
		}
	}
}
