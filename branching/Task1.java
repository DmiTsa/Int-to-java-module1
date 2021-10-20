package module1.branching;

import java.util.Scanner;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли 
//он прямоугольным.
public class Task1 {

	public static void main(String[] args) {
		int angle1;
		int angle2; 
		
		System.out.println("Введите два угла треугольника в градусах");
		angle1 = getIntFromConsole();
		angle2 = getIntFromConsole();


		if ((angle1 + angle2) < 180) {
			System.out.print("Треугольник существует");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
				System.out.print(". Прямоугольный.");
			} else {
				System.out.print(". Не прямоугольный.");
			}
		} else {
			System.out.print("Треугольник не существует.");
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
