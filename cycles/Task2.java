package module1.cycles;

import java.util.Scanner;

// Вычислить значения функции на отрезке [а,b] c шагом h y=x при x>2, y=-x при x<=2
public class Task2 {

	public static void main(String[] args) {
		double beginInterval;
		double endInterval;
		double step;
		
		System.out.println("Введите интервал для функции");
		beginInterval = getDoubleFromConsole();
		endInterval = getDoubleFromConsole();
		System.out.println("Введите шаг функции");
		step = getDoubleFromConsole();

		do {
			if (beginInterval >= 2) {
				System.out.println(beginInterval);
				beginInterval += step;
			} else {
				System.out.println( (-beginInterval) );
				beginInterval += step;
			}
		} while (beginInterval <= endInterval);
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
