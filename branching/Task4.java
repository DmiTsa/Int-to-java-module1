package module1.branching;

import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//Определить, пройдет ли кирпич через отверстие.
public class Task4 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double a;
		double b;

		System.out.println("Введите размеры кирпича");
		x = getDoubleFromConsole();
		y = getDoubleFromConsole();
		z = getDoubleFromConsole();
		System.out.println("Введите размер отверстия");
		a = getDoubleFromConsole();
		b = getDoubleFromConsole();

		double minSize;
		double maxSize;
		double midSize;

		minSize = Math.min(x, Math.min(y, z));
		maxSize = Math.max(x, Math.max(y, z));
		midSize = (x + y + z) - minSize - maxSize;

		if (minSize < Math.min(a, b) && midSize < Math.max(a, b)) {
			System.out.print("Кирпич пройдет");
		} else {
			System.out.print("Кирпич не пройдет");
		}
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
