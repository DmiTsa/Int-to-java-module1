package module1.branching;

import java.util.Scanner;

//Найти max{min(a, b), min(c, d)}.
public class Task2 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double rezult;
		
		System.out.println("Введите числа a,b,c,d");
		a = getDoubleFromConsole();
		b = getDoubleFromConsole();
		c = getDoubleFromConsole();
		d = getDoubleFromConsole();

		rezult = Math.max(Math.min(a, b), Math.min(c, d));
		
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
