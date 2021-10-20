package module1.cycles;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
//import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
		int beginRange;
		int endRange;
		
		System.out.print("Введите начало промежутка");
		beginRange = getIntFromConsole();
		System.out.print("Введите конец промежутка");
		endRange = getIntFromConsole();

		for (int i = beginRange; i <= endRange; i++) {
			System.out.print(i + " делители: ");
			for (int j = 2; j < endRange; j++) {
				if ((i % j == 0) && (i != j)) {
					System.out.print(" " + j);
				}
			}
			System.out.println();
		}
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
