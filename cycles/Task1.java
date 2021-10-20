package module1.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует 
//все числа от 1 до введенного пользователем числа.
public class Task1 {
	public static void main(String[] arg) {
		int x;
		int sum;
		
		do {
		System.out.println("Введите целое положительное число");
		x = getIntFromConsole();
		} while (x <= 0);

		sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.println("Сумма чисел от 1 до "+ x + " равна " + sum);
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
