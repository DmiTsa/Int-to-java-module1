package module1.basic;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
//принадлежит закрашенной области, и false — в противном случае:
public class Task6 {
	public static void main(String[] args) {
		int x;
		int y;
		boolean firstArea;
		boolean secondArea;
		
		System.out.println("Введите координаты");
		x = getIntFromConsole();
		y = getIntFromConsole();

		firstArea = ((x <= 2 && x >= -2) && (y <= 4 && y >= 0));
		secondArea = ((x <= 4 && x >= -4) & (y <= 0 && y >= -3));

		System.out.println(firstArea || secondArea);
	}

	private static int getIntFromConsole() {
		int value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print(">");
		}

		value = scanner.nextInt();

		return value;
	}
}