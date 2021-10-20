package module1.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task8n {

	public static void main(String[] args) {
		int numberOne;
		int numberTwo;

		System.out.println("Введите два целых числа");
		numberOne = Math.abs(getIntFromConsole());
		numberTwo = Math.abs(getIntFromConsole());

		int currentDigitOne;
		int currentDigitTwo;
		int numberTwoCopy;

		numberTwoCopy = numberTwo;

		System.out.println("Общие цифры для обоих чисел:");
		do {
			currentDigitOne = numberOne % 10;
			numberOne /= 10;

			do {
				currentDigitTwo = numberTwo % 10;
				numberTwo /= 10;

				if (currentDigitOne == currentDigitTwo) {
					System.out.print(currentDigitOne + " ");
				}

			} while (numberTwo != 0);

			numberTwo = numberTwoCopy;

		} while (numberOne != 0);
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
}