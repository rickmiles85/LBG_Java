package Methods_Exercise;

public class App {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		System.out.println(add(20, 30));
		System.out.println(divide(100, 25));
		System.out.println(subtract(50, 10));
		System.out.println(multiply(25, 25));

	}
}
