package module1.cycles;

import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен 
//заданному е. Общий член ряда имеет вид: An=1/2(n) + 1/3(n)
public class Task5 {

	public static void main(String[] args) {
		double sum;
		double current;
		double e;
		int countMember;

		System.out.println("Введите число членов ряда");
		do {
			countMember = getIntFromConsole();
		} while (countMember < 0);
		System.out.print("Введите заданное число");
		e = getDoubleFromConsole();

		sum = 0;

		for (int i = 1; i <= countMember; i++) {
			current = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if (Math.abs(current) >= e) {
				sum += current;
			}
		}
		System.out.println("Сумма членов ряда, больших " + e + " . Равна " + sum);
	}

	private static int getIntFromConsole() {
		int value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Неверный ввод! Повторите");
			System.out.print(">");
		}

		value = scanner.nextInt();

		return value;
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