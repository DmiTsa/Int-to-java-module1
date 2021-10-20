package module1.branching;

// Вычислить значение функции
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		double value;
		double rezult;
		
		System.out.println("Введите значение х");
		value = getDoubleFromConsole();
		
		if (value <= 3) {
			rezult = Math.pow(value, 2) - 3 * value + 9;
		} else {
			rezult = 1 / (Math.pow(value, 3) + 6);
		}
		System.out.println("Результат: " + rezult);
	}
	private static double getDoubleFromConsole() {
		double value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Неверный ввод! Повторите");
			System.out.print(">");
		}

		value = scanner.nextDouble();

		return value;
	}
}
